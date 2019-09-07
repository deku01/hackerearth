/*
Problem Description:
Given a series of integer pairs  and , output the sum of  and .

Input Format:
Each line contains two integers,  and . One input file may contain several pairs  where .

Output Format:
Output a single integer per line - The sum of  and .

Constraints:
0<=A,B<=10^98

SAMPLE INPUT                            SAMPLE OUTPUT 
1 2                                           3   
2 5                                           7      
10 14                                         24  
*/

import java.util.Scanner;
import java.math.*;
class Sum {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String AA = sc.next();
            String BB = sc.next();
    		BigInteger A=new BigInteger(AA);
            BigInteger B=new BigInteger(BB);
            System.out.println(A.add(B));
        }
    }
}
