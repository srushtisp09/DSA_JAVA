import java.util.*;

public class basix {
    // public static void hollowRect(int row, int col) {
    // for (int i = 1; i <= row; i++) {
    // for (int j = 1; j <= col; j++) {
    // if (i == 1 || j == 1 || i == row || j == col) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }

    // }
    // System.out.println();
    // }
    // }
    // public static void rotatedhalfPyramid(int n) {
    // for (int i = 1; i < n; i++) {
    // for (int j = 1; j <= n - i; j++) { // spaces
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) { // stars
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // public static void invertedhalfpyramid(int n) {
    // for (int i = 1; i < n; i++) {
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }

    // public static void floyds(int n) {
    // int counter = 1;
    // for (int i = 0; i <= n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print(counter + " ");
    // counter++;
    // }
    // System.out.println();
    // }
    // }
    // public static void triangle(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // if ((i + j) % 2 == 0) {
    // System.out.print("1 ");
    // } else {
    // System.out.print("0 ");
    // }
    // }
    // System.out.println();
    // }

    // }
    // public static void butterfly(int n) {
    // for (int i = 1; i < n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }
    // public static void solidrhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // public static void hollowrhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // if (i == 1 || j == 1 || i == n || j == n) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }
    // public static void diamond(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * (i) - 1; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * (i) - 1; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }
    // public static void numberpyramid(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }

    // }
    // public static void linearSearch(int arr[]) {
    // int target = 5;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == target) {
    // System.out.println("target found at index " + i);
    // return;
    // }
    // }
    // }
    // public static void numberpyramid(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = i; j >= 1; j--) {
    // System.out.print(j + " ");
    // }
    // for (int j = 2; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // }
    // public static void largestInArray() {
    // int largest = Integer.MIN_VALUE;
    // int arr[] = { 1, 2, 3, 4, 5, -1, -2 };
    // for (int i = 0; i < arr.length; i++) {
    // if (largest < arr[i]) {
    // largest = arr[i];
    // }
    // }
    // System.out.println("largest in array is :" + largest);
    // }
    // public static int binarySearch(int numbers[], int key) {
    // int start = 0;
    // int end = numbers.length - 1;
    // while (start <= end) {
    // int mid = (start + end) / 2;
    // if (numbers[mid] == key) {
    // System.out.println("key found at index :" + mid);
    // return mid;
    // } else if (numbers[mid] < key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }
    // public static int binarysearch(int numbers[], int key) {
    // int start = 0;
    // int end = numbers.length - 1;
    // while (start <= end) {
    // int mid = (start + end) / 2;
    // if (numbers[mid] == key) {
    // System.out.println("key found at index :" + mid);
    // return mid;
    // } else if (numbers[mid] < key) {
    // start = mid + 1;

    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }
    // REVERSE AM ARRAY
    // public static void reverseArray(int numbers[]) {
    // int first = 0, last = numbers.length - 1;
    // while (first < last) {
    // int temp = numbers[last];
    // numbers[last] = numbers[first];
    // numbers[first] = temp;
    // first++;
    // last--;

    // }

    // }
    // public static void pairs(int numbers[]) {
    // int totalpairs = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // for (int j = i + 1; j < numbers.length; j++) {
    // System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
    // totalpairs++;
    // }
    // System.out.println();

    // }
    // System.out.println("total pairs :" + totalpairs);
    // }
    // public static void subarrays(int numbers[]) {

    // for (int i = 0; i < numbers.length; i++) {
    // for (int j = i; j < numbers.length; j++) {

    // for (int k = i; k <= j; k++) {
    // System.out.print(numbers[k] + " ");

    // }
    // System.out.println();

    // }
    // System.out.println();
    // }
    // }

    // public static void subarraySum(int numbers[]) {
    // int currSum = 0;
    // int maxSum = Integer.MIN_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // for (int j = i; j < numbers.length; j++) {
    // currSum = 0;
    // for (int k = i; k <= j; k++) {
    // currSum += numbers[k];
    // }
    // System.out.println(currSum);
    // if (maxSum < currSum) {
    // maxSum = currSum;
    // }

    // }

    // }
    // System.out.println("max sum is :" + maxSum);
    // }
    // public static void prefixsum(int numbers[]) {
    // int currSum = 0;
    // int maxSum = Integer.MIN_VALUE;
    // int prefix[] = new int[numbers.length];
    // prefix[0] = numbers[0];
    // for (int i = 1; i < prefix.length; i++) {
    // prefix[i] = prefix[i - 1] + numbers[i];
    // }
    // for (int i = 0; i < numbers.length; i++) {
    // for (int j = i; j < numbers.length; j++) {
    // currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
    // if (maxSum < currSum) {
    // maxSum = currSum;
    // }
    // }
    // }
    // System.out.println("max sum is :" + maxSum);
    // // }
    // public static void kadanes(int numbers[]) {
    // int ms = Integer.MIN_VALUE;
    // int cs = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // cs = cs + numbers[i];
    // if (cs < 0) {
    // cs = 0;
    // }
    // ms = Math.max(ms, cs);
    // }
    // System.out.println("max sum is :" + ms);
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // while (a > 0) {
    // int lastdigit = a % 10;
    // System.out.print(lastdigit + "");
    // a = a / 10;
    // }
    // int rev = 0;
    // while (a > 0) {
    // int lastdigit = a % 10;
    // rev = rev * 10 + lastdigit;
    // a = a / 10;

    // }
    // System.out.print(rev);

    // check if number is prime or not
    // if (n == 2) {
    // System.out.println("prime");

    // } else {
    // boolean isPrime = true;
    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // }

    // }
    // if (isPrime == true) {
    // System.out.print("prime");
    // } else {
    // System.out.print("not prime");
    // }

    // }
    /// PATTERNS
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.print("*");

    // }
    // System.out.println();
    // }
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // for (int i = 1; i < n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // char ch = 'A';
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.print(ch);
    // ch++;
    // }
    // System.out.println();
    // }
    // hollowRect(5, 5);
    // rotatedhalfPyramid(5);
    // invertedhalfpyramid(5);
    // floyds(5);
    // triangle(5);
    // butterfly(8);
    // solidrhombus(5);
    // hollowrhombus(5);
    // diamond(5);
    // numberpyramid(5);
    // linearSearch(new int[] { 4, 5, 6, 7, 8, 2 });
    // largestInArray();
    // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // int key = 10;
    // System.out.println(binarysearch(numbers, key));

    // int numbers[] = { 2, 4, 6, 8, 10 };
    // reverseArray(numbers);
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i] + " ");
    // }
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // pairs(numbers);
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // subarrays(numbers);
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // // subarraySum(numbers);
    // prefixsum(numbers);
    // int numbers[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    // kadanes(numbers);

    // }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        System.out.print(binarySearch(arr, target));
    }

    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;

            } else if (target < arr[mid]) {
                end = mid - 1;
                return end;

            } else {
                start = mid + 1;
                return start;

            }

        }
        return -1;
    }
}
