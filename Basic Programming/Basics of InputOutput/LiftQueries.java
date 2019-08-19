/*
There are 7 floors in BH3 and only 2 lifts. Initially Lift A is at the ground floor and Lift B at the top floor. Whenever someone 
calls the lift from N th floor, the lift closest to that floor comes to pick him up. If both the lifts are at equidistant from 
the N th floor, them the lift from the lower floor comes up.

INPUT:
First line contains a integer T denoting the number of test cases.
Next T lines contains a single integer N denoting the floor from which lift is called.

OUTPUT:
Output T lines containing one character "A" if the first lift goes to N th floor or "B" for the second lift.

Explanation:
3rd floor calls, Lift A(0) goes there.
5th  floor calls, Lift A(3) and Lift B(7) are equidistant from 5, so Lift from lowest floor goes there i.e. A.
*/

import java.util.*;
import java.lang.*;
class LiftQueries {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int firstLiftAt = 0;
        int secondLiftAt = 7;
        for(int i=1;i<=T;i++){
            int N = s.nextInt();
            int firstLiftDiff = Math.abs(N-firstLiftAt);
            int secondLiftDiff = Math.abs(secondLiftAt-N);
            if(firstLiftDiff<secondLiftDiff){
                System.out.println("A");
                firstLiftAt = N;
            }
            else if(secondLiftDiff<firstLiftDiff){
                System.out.println("B");
                secondLiftAt = N;
            }
            else{
                System.out.println("A");
                firstLiftAt = N;
            }
        }
    }
}
