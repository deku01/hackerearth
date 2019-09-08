/*
Write a java program to print the given Square Pattern on taking an integer as input from commandline.
Input : 3
Output :1 8 7.
        2 9 6
        3 4 5
Input :5
Output :1  16  15  14  13
        2  17  24  23  12
        3  18  25  22  11
        4  19  20  21  10
        5  6   7   8   9 
*/

import java.util.*;
class SquarePattern2 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int low=0;
		int high=n-1;
		int num=1;
		int arr[][] = new int[n][n];
		for(int i=0;i<(n+1)/2;i++){
			for(int j=low;j<high+1;j++){
				arr[j][i]=num;
				num++;
			}
			for(int j=low+1;j<high+1;j++){
				arr[high][j]=num;
				num++;
			}
			for(int j=high-1;j>low-1;j--){
				arr[j][high]=num;
				num++;
			}
			for(int j=high-1;j>low;j--){
				arr[low][j]=num;
				num++;
			}
			low=low+1;
			high=high-1;
		}
		System.out.println("The required pattern is");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
