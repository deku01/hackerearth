/*
Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. 
More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. 
All numbers at input are integers of one or two digits.
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            while(n!=42){
                System.out.println(n);
                n=sc.nextInt();
        }
    }
}
