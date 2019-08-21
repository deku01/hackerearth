import java.util.*;
class BreakUp{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        for(int i=1;i<=n;i++){
            int y = s.nextInt();
            if(y>=x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}