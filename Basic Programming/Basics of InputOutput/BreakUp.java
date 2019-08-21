/*
Goki recently had a breakup, so he wants to have some more friends in his life. Goki has N people who he can be friends with, so he decides to choose among them according to their skills set Yi(1<=i<=n). He wants atleast X skills in his friends.
Help Goki find his friends.

INPUT:
First line of the input contains an integer N denoting the number of people.
Next line contains a single integer X - denoting the minimum skill required to be Goki's friend. 
Next n lines contain one integer Y - denoting the skill of ith person.

OUTPUT:
For each person print if he can be friend with Goki. 'YES' (without quotes) if he can be friends with Goki else 'NO' (without quotes).

CONSTRAINTS

1<=N<=1000000
1<=X,Y<=1000000

SAMPLE INPUT                SAMPLE OUTPUT 
5                           YES
100                         YES
110                         NO
130                         YES
90                          NO
100
45

Explanation
X is 100, so the first query is 110, so as 110 is greater than 100 answer is YES.
*/

import java.util.*;
class BreakUp{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        for(int i=1;i<=n;i++){
            int y = s.nextInt();
            if(y>=x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
