/*
Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

Input :

test cases,t
two strings a and b, for each test case
Output:

Desired O/p

Constraints :

string lengths<=10000

Note :

Anagram of a word is formed by rearranging the letters of the word.

For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class Anagram{
	public static void main(String args[])throws Exception{
		System.out.println("Enter the number of testCase");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); 
		for(int i=0;i<test;i++){
			String str1,str2;
			int count=0;
			System.out.println("Enter the 1st string");
			str1 = br.readLine();
			System.out.println("Enter the 2nd string");
			str2 = br.readLine();
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			int n1 = ch1.length;
			int n2 = ch2.length;	
			for(int j= 0;j<n1;j++){
				for(int k= 0;k<n2;k++){
					if(ch1[j]==ch2[k]){
						count++;
						ch2[k]='0';
						break;
					}
				}
			}
			System.out.println(ch1.length+ch2.length-(2*count));
		}
	}
}