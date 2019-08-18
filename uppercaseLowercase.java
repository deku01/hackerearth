/*
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.
*/

import java.util.*;
class uppercaseLowercase{
    public static void main (String[] args){
        int i,len;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
			}
            else{
                System.out.print(Character.toUpperCase(ch));
			}
        }
    }
}