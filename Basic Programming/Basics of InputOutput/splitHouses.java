import java.util.*;
class splitHouses {
    public static void main(String args[] ) throws Exception {
      
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[] village=s.next().toCharArray();
        boolean flag = false;
        for(int i=1;i<n;i++){
            if(village[i-1]=='H' && village[i]=='H'){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            for(int i=0;i<n;i++){
                if(village[i]=='.')
                    village[i]='B';
            }
            for(int i=0;i<n;i++)
            System.out.print(village[i]);
        }
    }
}
 