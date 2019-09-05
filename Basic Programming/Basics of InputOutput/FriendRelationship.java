/*
Jack is your friend and Sophia is his girlfriend. But due to some unknown reason ( unknown for us, they know it) Sophia started hating 
to Jack. Now, Jack is in big trouble but he has a solution, He knows that if he will gift T patterns of a particular type 
( For pattern observation see the sample test cases) then Sophia will start loving again to Jack. But Jack is depressed now and need 
your help to gift her that type patterns of '*' and '#' of N lines. So, it's your responsibility to save your friend's relationship.

Constraints :
1 ≤  T ≤ 100
1 ≤  N ≤ 30

Input :
First Line contains T i.e. number of test case.
Each of the next T lines contain an integer N.

Output:
For each test case print the pattern of N lines then after a blank line.

SAMPLE INPUT 						  SAMPLE OUTPUT
3									

9							*################*
							**##############**
							***############***
							****##########****
							*****########*****
							******######******
							*******####*******
							********##********
							******************
								

2							*##*
							****

5							*########*
							**######**
							***####***
							****##****
							**********
*/


import java.util.*;
class FriendRelationship {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i = 1;i<=T;i++){
            int N = s.nextInt();
            int M=2*N;
            int j=0;
            while(j<N){
                for(int k=0;k<=j;k++){
                    System.out.print("*");
                }
                M = M-2;
                for(int l=0;l<M;l++){
                    System.out.print("#");
                }
                for(int p=0;p<=j;p++){
                    System.out.print("*");
                }
                j++;
		System.out.println();
            }   
            System.out.println("\n");
        }

    }
}
