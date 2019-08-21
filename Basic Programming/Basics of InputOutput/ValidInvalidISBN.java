import java.util.*;
class ValidInvalidISBN {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String ISBN = s.nextLine();
        int sum=0;
        if(ISBN.length()==10){
            for(int i=0;i<ISBN.length();i++){
                sum=sum+((i+1)*ISBN.charAt(i));
            }
            if(sum%11==0){
                System.out.println("Legal ISBN");
            }
            else{
                System.out.println("Illegal ISBN");
            }
        }
        else{
            System.out.println("Illegal ISBN");
        }
    }
}