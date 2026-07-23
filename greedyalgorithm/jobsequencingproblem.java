import java.util.*;
public class jobsequencingproblem {
    static class Job{ ///----> CLASS  static means "this nested class doesn't depend on an outer object existing" — you can create Job objects without first creating an instance of the outer class. Without static, you'd be forced to write
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){ /// ---->THIS IS A CONSTRUCTOR
            id=i;
            deadline=d;
            profit=p;
        }

    }
    public static void main(String args[]){
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
         ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<=jobsInfo.length-1;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
 
//descending order of profit
int maxdeadline=0;
ArrayList<Integer> seq=new ArrayList<>();
int time=0;
for(int i=0;i<=jobs.size()-1;i++){
    Job curr=jobs.get(i);
    if(curr.deadline>time){
        seq.add(curr.id);
        time++;
    }
}
System.out.println("Max jobs ="+seq.size());
for(int i=0;i<seq.size();i++){
    System.out.println(seq.get(i)+" ");
}
System.out.println();
    } 
}
///static class pattern constantly in problems like Job Sequencing with Deadlines, Meeting Rooms, Interval Scheduling, and anywhere the "unit" you're working with has multiple named properties.
/// ///Setup (same as before):

 
// int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

// Each row is {deadline, profit}. Row 0 → deadline 4, profit 20. Row 2 → deadline 1, profit 40. And so on.

// Building Job objects:

// java
// for(int i=0;i<=jobsInfo.length-1;i++){
//     jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
// }

// For each row, you create a Job with id = i (the original position), deadline = jobsInfo[i][0], profit = jobsInfo[i][1]. This is exactly why the Job class was worth writing — you're bundling three related values into one object instead of juggling jobsInfo[i][0] / [1] everywhere.

// Sorting by profit descending:

// java
// Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);

// Greedy idea: always try to take the highest-profit job first, and only skip it if there's genuinely no room for it. obj2.profit - obj1.profit sorts descending (if obj2 has more profit, the result is positive, so obj2 sorts before obj1).

// The greedy selection — this is the part worth understanding deeply:

// java
// int time=0;
// for(int i=0;i<=jobs.size()-1;i++){
//     Job curr=jobs.get(i);
//     if(curr.deadline>time){
//         seq.add(curr.id);
//         time++;
//     }
// }

// Here, time just tracks how many jobs you've already accepted. The check curr.deadline > time is asking: "is there still room somewhere in this job's deadline window, given how many jobs I've already committed to?"

// Think of it this way — if you've already accepted 2 jobs, that means those 2 jobs will occupy some two time units, whatever they turn out to be. For the current job to also fit, its deadline just needs to be greater than 2 (i.e. greater than the number of jobs already accepted) — because there's guaranteed to be at least one free unit somewhere in [1, deadline] that isn't already claimed by a higher-priority job.

// Why this works without tracking exact slots: every job you've accepted so far has a deadline ≥ the current job's deadline check point (since you're always comparing against the count, not specific positions), so by a simple counting/exchange argument, if deadline > time, a valid arrangement always exists — you just don't know or care which slot number each job lands in. You only care about count and which ids made it in.

// Dry run with your data — sorted by profit descending: Job2(id2,d1,p40), Job3(id3,d1,p30), Job0(id0,d4,p20), Job1(id1,d1,p10)

// i	job	deadline > time?	action	time after
// 0	Job2 (d=1)	1 > 0 ✓	add id 2	1
// 1	Job3 (d=1)	1 > 1 ✗	skip	1
// 2	Job0 (d=4)	4 > 1 ✓	add id 0	2
// 3	Job1 (d=1)	1 > 2 ✗	skip	2

// Result: seq = [2, 0], max jobs = 2 — same answer as the slot-array version I gave you earlier, just computed differently.