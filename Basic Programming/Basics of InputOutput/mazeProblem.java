/*
Ankit is in maze. The command center sent him a string which decodes to come out from the maze. He is initially at (0, 0). 
String contains L, R, U, D denoting left, right, up and down. In each command he will traverse 1 unit distance in the respective direction.
For example if he is at (2, 0) and the command is L he will go to (1, 0).

Input:

Input contains a single string.

Output:

Print the final point where he came out.
*/

import java.util.*;
class mazeProblem{    
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int x_axis = 0;
		int y_axis = 0;
		char ch;
		for(int i=0;i<str.length();i++){
			ch = str.charAt(i);
			switch(ch){
				case 'L': x_axis--; break;
				case 'R': x_axis++; break;
				case 'U': y_axis++; break;
				case 'D': y_axis--; break;
			}
		}
		System.out.println("("+x_axis+ ","+y_axis+")");		
	}		
}