/*
Indian army is going to do a surprise attack on one of its enemies country. The President of India, the Supreme Commander of the Indian 
Army will be sending an alert message to all its commanding centers. As enemy would be monitoring the message, Indian army is going to 
encrypt(cipher) the message using basic encryption technique. A decoding key 'K' (number) would be sent secretly.
You are assigned to develop a cipher program to encrypt the message. Your cipher must rotate every character in the message by a 
fixed number making it unreadable by enemies.
Given a single line of string 'S' containing alpha, numeric and symbols, followed by a number '0<=N<=1000'. Encrypt and print the 
resulting string.

Note: The cipher only encrypts Alpha and Numeric. (A-Z, a-z, and 0-9) . All Symbols, such as - , ; %, remain unencrypted.

SAMPLE INPUT:                           SAMPLE OUTPUT
All-convoYs-9-be:Alert1.                Epp-gsrzsCw-3-fi:Epivx5.
4

Explanation:

First line contains the string to convert. S
Second line contains the number, encrypt key. K
A becomes E, Y becomes C, 9 becomes 3,
-, . unchanged.
*/

import java.util.*;
class Cipher{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder cipher=new StringBuilder("");
        int k = sc.nextInt();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                cipher.append((char) (((s.charAt(i)-'A'+k)%26)+'A'));
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                cipher.append((char) (((s.charAt(i)-'a'+k)%26)+'a'));
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                cipher.append((char) (((s.charAt(i)+k-48)%10)+48));
            }
            else{
                cipher.append(s.charAt(i));
            }
        }
        System.out.println(cipher);
    }
}
