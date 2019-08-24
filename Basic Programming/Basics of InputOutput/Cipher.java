import java.util.*;
class Cipher{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder cipher=new StringBuilder("");
        int k = sc.nextInt();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                cipher.append((char) (((s.charAt(i)-'A'+k)%26)+'A'));
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                cipher.append((char) (((s.charAt(i)-'a'+k)%26)+'a'));
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                cipher.append((char) (((s.charAt(i)+k-48)%10)+48));
            }
            else{
                cipher.append(s.charAt(i));
            }
        }
        System.out.println(cipher);
    }
}