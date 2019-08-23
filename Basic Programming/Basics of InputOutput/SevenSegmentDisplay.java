/*
You all must have seen a seven segment display.If not here it is:
Alice got a number written in seven segment format where each segment was creatted used a matchstick.
Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.
Alice is wondering what is the numerically largest value that she can generate by using at most the matchsticks that she currently 
possess.Help Alice out by telling her that number.

Input Format:
First line contains T (test cases).
Next T lines contain a Number N.

Output Format:
Print the largest possible number numerically that can be generated using at max that many number of matchsticks which was used to 
generate N.

SAMPLE INPUT 				SAMPLE OUTPUT
2							1
1							111
0

Explanation
If you have 1 as your number that means you have 2 match sticks.You can generate 1 using this.
If you have 0 as your number that means you have 6 match sticks.You can generate 111 using this.
*/

import java.util.*;
class SevenSegmentDisplay{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			String n = sc.next();
			int sum=0;
			for(int j=0;j<n.length();j++){
				if(n.charAt(j)=='0' || n.charAt(j)=='6' || n.charAt(j)=='9'){
					sum+=6;
				}
				else if(n.charAt(j)=='1'){
					sum+=2;
				}
				else if(n.charAt(j)=='7'){
					sum+=3;
				}
				else if(n.charAt(j)=='4'){
					sum+=4;
				}
				else if(n.charAt(j)=='5' || n.charAt(j)=='2' || n.charAt(j)=='3'){
					sum+=5;
				}
				else if(n.charAt(j)=='8'){
					sum+=7;
				}
			}
			if(sum%2==0){
				for(int j=0;j<sum/2;j++){
					System.out.print("1");
				}
			}
			else{
				System.out.print("7");
				sum=sum-3;
				for(int j=0;j<sum/2;j++){
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
						
				
				
