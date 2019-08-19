/*
You are conducting a contest at your college. This contest consists of two problems and  participants. You know the problem that a candidate will 
solve during the contest.

You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. 
Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant 
by performing the following operation:

Use green-colored balloons for the first problem and purple-colored balloons for the second problem
Use purple-colored balloons for the first problem and green-colored balloons for the second problem
You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.

Input format

First line:  that denotes the number of test cases ()
For each test case: 
First line: Cost of green and purple-colored balloons 
Second line:  that denotes the number of participants ()
Next  lines: Contain the status of users. For example, if the value of the  integer in the  row is , then it depicts that the  participant has not solved the  problem. Similarly, if the value of the  integer in the  row is , then it depicts that the  participant has solved the  problem.
Output format
For each test case, print the minimum cost that you have to pay to purchase balloons.
*/

import java.util.*;
class contest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++){
			int greenBalloon = sc.nextInt();
			int purpleBalloon = sc.nextInt();
			int p = sc.nextInt();
			int arr[][] = new int[p][2];
			int cost1=0;
			int cost2=0;
			for(int i=0;i<p;i++){
				for(int j=0;j<2;j++){
					arr[i][j]=sc.nextInt();   //storing persons data i.e either 0 0 or 1 1 or 1 0 0r 0 1
					if(j==0){
						cost1 +=(greenBalloon * arr[i][j]);
						cost2 +=(purpleBalloon * arr[i][j]);
					}
					else if(j==1){
						cost1 += (purpleBalloon * arr[i][j]);
						cost2 += (greenBalloon * arr[i][j]);
					}
				}
			}
			if(cost1<cost2)
				System.out.println(cost1);
			else
				System.out.println(cost2);
		}
	}
}