/*
{a,e,i,o,u,A,E,I,O,U}
Natural Language Understanding is the subdomain of Natural Language Processing where people used to design AI based applications have 
ability to understand the human languages. HashInclude Speech Processing team has a project named Virtual Assistant. For this project 
they appointed you as a data engineer (who has good knowledge of creating clean datasets by writing efficient code). As a data engineer 
your first task is to make vowel recognition dataset. In this task you have to find the presence of vowels in all possible substrings 
of the given string. For each given string you have to print the total number of vowels. 

Input:
First line contains an integer T, denoting the number of test cases.
Each of the next lines contains a string, string contains both lower case and upper case .

Output:
Print the vowel sum
Answer for each test case should be printed in a new line.

Input Constraints:
1<=T<=10
1<=|S|<=100000

SAMPLE INPUT:			SAMPLE OUTPUT:
1				16
baceb

Explanation:
First line is number of input string, In given example, string is "baceb" so the substrings will be like -"b, ba, bac, bace, a, ac, ace,
aceb, c, ce, ceb, e, eb, baceb" now the number of vowels in each substring will be 0, 1, 1, 2, 1, 1, 2, 2, 0, 1, 1, 1, 1, 2  and 
the total number will be sum of all presence which is 16.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class vowelRecognition {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
			long count=0;
            String str = br.readLine();
       		for(int l=0;l<str.length();l++){
                if(str.charAt(l)=='a' ||str.charAt(l)=='e' ||str.charAt(l)=='i' ||
                    str.charAt(l)=='o' ||str.charAt(l)=='u' ||str.charAt(l)=='A' ||str.charAt(l)=='E' ||
                    str.charAt(l)=='E' ||str.charAt(l)=='I' ||str.charAt(l)=='O' ||str.charAt(l)=='U'){
                    count+=(long)(str.length()-l)*(l+1);
                }
       		}
			System.out.println(count);
		}
    }
}


/*
Alogrithm Explanation:
I'll try to explain it by an example:
Let's say the string is baceb. Now we do a loop through the chars:
b: not a vowel, so continue with next char
a: a vowel; now we have 2 possibilities for left substring [ba, a] and 4 possibilities for right substring [a, ac, ace, aceb]. So this 'a' contributes 2*4=8 to the answer.
c: not a vowel
e: a vowel, left substrings [bace,ace,ce,e], i.e. 4 substrings, right substrings [e,eb], i.e. 2 substrings. So again the contribution is 2*4=8.
b: not a vowel

Now we can derived a formula: (strlen-i)*(i+1)
formula for each vowel count is------> ( length of String - index of vowel ) * ( index + 1 )
which comes out as:
# Starting with this vowel and containing string of single vowel also
==> ( length of String - index )
# Ending with this vowel and not containing single of single vowel
==> ( index )
# Containing this vowel in between
==> ( length of String - index - 1 ) * index
therefore,
total no of strings having this vowel = ( length of String - index ) + ( index ) + ( length of String - index - 1 ) * index
==> length of String + length of String * index - index * index - index
==> length of String ( 1 + index ) - index (1 + index )
==> ( 1 + index ) * ( length of String - index ) =====>>>> ANSWER 

In total that's an answer of 16 for this example.
Does that help?

*/
