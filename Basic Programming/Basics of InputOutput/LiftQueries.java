import java.util.*;
import java.lang.*;
class LiftQueries {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int firstLiftAt = 0;
        int secondLiftAt = 7;
        for(int i=1;i<=T;i++){
            int N = s.nextInt();
            int firstLiftDiff = Math.abs(N-firstLiftAt);
            int secondLiftDiff = Math.abs(secondLiftAt-N);
            if(firstLiftDiff<secondLiftDiff){
                System.out.println("A");
                firstLiftAt = N;
            }
            else if(secondLiftDiff<firstLiftDiff){
                System.out.println("B");
                secondLiftAt = N;
            }
            else{
                System.out.println("A");
                firstLiftAt = N;
            }
        }
    }
}