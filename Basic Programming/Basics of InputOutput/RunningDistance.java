import java.util.*;
class RunningDistance{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int toffee = 0;
        double r,x,circumference,capacity;
        for(int i=1;i<=d;i++){
            r = s.nextInt();
            x = s.nextInt();
            circumference = 2*22*r/7;
            capacity = 100*x;
            if(capacity>=circumference){
                toffee++;
            }
        }
        System.out.println(toffee);
    }
}