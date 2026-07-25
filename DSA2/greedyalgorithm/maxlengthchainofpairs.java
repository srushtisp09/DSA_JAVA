import java.util.*;
public class maxlengthchainofpairs {
    public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o-> o[1]));
        int chainLen=1;
        int chainEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println("Max length of chain="+chainLen);
    }
}
//The pattern to remember: any time you sort by finish time (or end value) and greedily extend a chain/schedule, index 0 is always your seed — added for free, loop starts from index 1.
//Max chain of pairs: you only need the count (chainLen). Nobody asks "which pairs made the chain" — so pairs[i][0] = start, pairs[i][1] = end is enough. Two columns, no id needed.

// Activity selection: you print out which activities got selected (A0, A1, A3, A4). But the moment you sort activities by end time, the original order is gone — row 0 after sorting might have originally been activity 4. So you store the original index in column 0 before sorting, as a way to carry the activity's identity along with it through the sort.