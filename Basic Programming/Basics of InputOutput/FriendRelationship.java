import java.util.*;
class FriendRelationship {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i = 1;i<=T;i++){
            int N = s.nextInt();
            int M=2*N;
            int j=0;
            while(j<N){
                for(int k=0;k<=j;k++){
                    System.out.print("*");
                }
                M = M-2;
                for(int l=0;l<M;l++){
                    System.out.print("#");
                }
                for(int p=0;p<=j;p++){
                    System.out.print("*");
                }
                j++;
				System.out.println();
            }   
            System.out.println("\n");
        }

    }
}