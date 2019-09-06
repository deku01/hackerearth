import java.util.*;
class MagicalWord {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
           // StringBuilder magic = new StringBuilder("");
            int n = sc.nextInt();
            String str = sc.next();
            for(int j=0;j<str.length();j++){
                char character = str.charAt(j);    
				int ascii = (int) character;
                if(ascii<=69){
                    System.out.print("C");
                }
                else if(ascii>=70 &&  ascii<=72){
                    System.out.print("G");
                }
                else if(ascii>=73 &&  ascii<=76){
                    System.out.print("I");
                }
                else if(ascii>=77 &&  ascii<=81){
                    System.out.print("O");
                }
                else if(ascii>=82 &&  ascii<=86){
                    System.out.print("S");
                }
                else if(ascii>=87 &&  ascii<=93){
                    System.out.print("Y");
                }
                else if(ascii>=94 &&  ascii<=99){
                    System.out.print("a");
                }
                else if(ascii>=100 &&  ascii<=102){
                    System.out.print("e");
                }
                else if(ascii>=103 &&  ascii<=105){
                    System.out.print("g");
                }
                else if(ascii>=106 &&  ascii<=108){
                    System.out.print("k");
                }
                else if(ascii>=109 &&  ascii<=111){
                    System.out.print("m");
                }
                else if(ascii>=112 &&  ascii<=127){
                    System.out.print("q");
                }
           }
           System.out.println();
        }
    }
}
