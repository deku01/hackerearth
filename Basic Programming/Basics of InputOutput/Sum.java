import java.util.Scanner;
import java.math.*;
class Sum {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String AA = sc.next();
            String BB = sc.next();
    		BigInteger A=new BigInteger(AA);
            BigInteger B=new BigInteger(BB);
            System.out.println(A.add(B));
        }
    }
}