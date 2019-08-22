import java.util.*;
class Str2{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            int n=str.charAt(i);
            sum=sum+(n-96);
        }
        System.out.println(sum);
    }
}