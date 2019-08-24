/*
You are given an array A of N elements. Now you need to choose the best index of this array A. An index of the array is called best 
if the special sum of this index is maximum across the special sum of all the other indices.

To calculate the special sum for any index i , you pick the first element that is A[i] and add it to your sum. Now you pick next two 
elements i.e. A[i+1] and A[i+1] and add both of them to your sum. Now you will pick the next  elements and this continues till the index for
which it is possible to pick the elements. For example:

If our array contains 10 elements and you choose index to be 3 then your special sum is denoted by (A[3]) + (A[4]+A[5]) + (A[6]+A[7]+A[8])
, beyond this its not possible to add further elements as the index value will cross the value 10.

Find the best index and in the output print its corresponding special sum. Note that there may be more than one best indices but 
you need to only print the maximum special sum.

Input
First line contains an integer N as input. Next line contains N space separated integers denoting the elements of the array .
Output
In the output you have to print an integer that denotes the maximum special sum

Input				Output
5				8
1 3 1 2 5

10				9
2 1 3 9 2 4 -10 -9 1 3
 

SAMPLE INPUT 			SAMPLE OUTPUT 
6				3
-3 2 3 -4 3 1

Explanation
Let us calculate the special value for each index :

For index 1: (A[1]) + (A[2]+A[3]) + (A[4]+A[5]+A[6]) = 2
For index 2: (A[2]) + (A[3]+A[4]) = 1
For index 3: (A[3]) + (A[4]+A[5]) = 2
For index 4: (A[4]) + (A[5]+A[6]) = 0
For index 5: (A[5]) = 3
For index 6: (A[6]) = 1
So the maximum value among all the special values is 3 hence it is the output.
*/

import java.util.*;
class BestIndex{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long prefixSum[] = new long[n];
        prefixSum[0] = arr[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        long specialValue = Integer.MIN_VALUE ;
        for(int i=0;i<n;i++){
            int s=0,y=1;
            int x=i;
            while(x<=n){
                x=x+y;
                y++;
            }
            s=x-y+1;
            if(i==0){
				arr[i]=prefixSum[s-1];
			}
			else{
				arr[i]=prefixSum[s-1]-prefixSum[i-1];
			}
			if(arr[i]>specialValue)
				specialValue=arr[i];
		}
		System.out.println(specialValue);
    }
}
