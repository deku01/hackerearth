/*
/*
Write a java program to print the given Square Pattern on taking an integer as input from commandline.
Input : 3
Output :1 2 3.
        8 9 4
        7 6 5
Input :5
Output :1   2   3   4   5
        16  17  18  19  6
        15  24  25  20  7
        14  23  22  21  8
        13  12  11  10  9 
*/
import java.util.*;
class SquarePattern3 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int low=0;
		int high=n-1;
		int num=1;
		int arr[][] = new int[n][n];
		for(int i=0;i<(n+1)/2;i++){
			for(int j=low;j<high+1;j++){
				arr[i][j]=num;
				num++;
			}
			for(int j=low+1;j<high+1;j++){
				arr[j][high]=num;
				num++;
			}
			for(int j=high-1;j>low-1;j--){
				arr[high][j]=num;
				num++;
			}
			for(int j=high-1;j>low;j--){
				arr[j][low]=num;
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
