/*
Write a java program to print the given Square Pattern on taking an integer as input from commandline.

Examples:
Input : 3
Output :    1 2 3.
            7 8 9
            4 5 6
Input :4
Output :    1  2  3  4 
            9  10 11 12
            13 14 15 16
            5  6  7  8 
*/
import java.util.*;
class SquarePattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int num=1;
		int high=n-1;
		for(int i=0;i<=n/2;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=num;
				num++;
			}
			if(high>n/2)
			for(int j=0;j<n;j++){
				arr[high][j]=num;
				num++;
			}
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
