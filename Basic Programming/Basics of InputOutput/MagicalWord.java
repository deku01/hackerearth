/*
Dhananjay has recently learned about ASCII values.He is very fond of experimenting. With his knowledge of ASCII values and character he 
has developed a special word and named it Dhananjay's Magical word.
A word which consist of alphabets whose ASCII values is a prime number is an Dhananjay's Magical word. An alphabet is Dhananjay's 
Magical alphabet if its ASCII value is prime.
Dhananjay's nature is to boast about the things he know or have learnt about. So just to defame his friends he gives few string to 
his friends and ask them to convert it to Dhananjay's Magical word. None of his friends would like to get insulted. Help them to 
convert the given strings to Dhananjay's Magical Word.

Rules for converting:
1.Each character should be replaced by the nearest Dhananjay's Magical alphabet.
2.If the character is equidistant with 2 Magical alphabets. The one with lower ASCII value will be considered as its replacement.

Input format:
First line of input contains an integer T number of test cases. Each test case contains an integer N (denoting the length of the string) and a string S.

Output Format:
For each test case, print Dhananjay's Magical Word in a new line.

Constraints:
1 <= T <= 100
1 <= |S| <= 500

SAMPLE INPUT 			SAMPLE OUTPUT
1				CGSCCO
6
AFREEN

Explanation
ASCII values of alphabets in AFREEN are 65, 70, 82, 69 ,69 and 78 respectively which are converted to CGSCCO with ASCII values 
67, 71, 83, 67, 67, 79 respectively. All such ASCII values are prime numbers.
*/

import java.util.*;
class MagicalWord {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
           // StringBuilder magic = new StringBuilder("");
            int n = sc.nextInt();
            String str = sc.next();
            for(int j=0;j<str.length();j++){
                char character = str.charAt(j);    
				int ascii = (int) character;
                if(ascii<=69){
                    System.out.print("C");
                }
                else if(ascii>=70 &&  ascii<=72){
                    System.out.print("G");
                }
                else if(ascii>=73 &&  ascii<=76){
                    System.out.print("I");
                }
                else if(ascii>=77 &&  ascii<=81){
                    System.out.print("O");
                }
                else if(ascii>=82 &&  ascii<=86){
                    System.out.print("S");
                }
                else if(ascii>=87 &&  ascii<=93){
                    System.out.print("Y");
                }
                else if(ascii>=94 &&  ascii<=99){
                    System.out.print("a");
                }
                else if(ascii>=100 &&  ascii<=102){
                    System.out.print("e");
                }
                else if(ascii>=103 &&  ascii<=105){
                    System.out.print("g");
                }
                else if(ascii>=106 &&  ascii<=108){
                    System.out.print("k");
                }
                else if(ascii>=109 &&  ascii<=111){
                    System.out.print("m");
                }
                else if(ascii>=112 &&  ascii<=127){
                    System.out.print("q");
                }
           }
           System.out.println();
        }
    }
}
