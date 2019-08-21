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