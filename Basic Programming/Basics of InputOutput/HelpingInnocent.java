/*
Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. 
Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid 
if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid 
or not. We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format:
The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an 
uppercase english letter.

Output Format
Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)

SAMPLE INPUT 			SAMPLE OUTPUT
12X345-67 			invalid

Explanation
The tag is invalid because the sum of first and second digit of it is odd (also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class HelpingInnocent {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(((str.charAt(0)+str.charAt(1))%2==0) && ((str.charAt(3)+str.charAt(4))%2==0) && ((str.charAt(4)+str.charAt(5))%2==0)&& ((str.charAt(7)+str.charAt(8))%2==0)){
            if((str.charAt(2)!='A') && (str.charAt(2)!='E') && (str.charAt(2)!='I') && (str.charAt(2)!='O') && (str.charAt(2)!='U') && (str.charAt(2)!='Y')){
                System.out.println("valid");
            }
            else{
                System.out.println("invalid");
            }
        }
        else{
            System.out.println("invalid");
		}
    }
}
