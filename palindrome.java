import java.io.BufferedReader;
import java.io.InputStreamReader;
class palindrome{
	public static void main(String args[] ) throws Exception {

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String original = br.readLine();
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse+=original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

	}
}
