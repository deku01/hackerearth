import java.io.BufferedReader;
import java.io.InputStreamReader;
class vowelRecognition {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
			long count=0;
            String str = br.readLine();
       		for(int l=0;l<str.length();l++){
                if(str.charAt(l)=='a' ||str.charAt(l)=='e' ||str.charAt(l)=='i' ||
                    str.charAt(l)=='o' ||str.charAt(l)=='u' ||str.charAt(l)=='A' ||str.charAt(l)=='E' ||
                    str.charAt(l)=='E' ||str.charAt(l)=='I' ||str.charAt(l)=='O' ||str.charAt(l)=='U'){
                    count+=(long)(str.length()-l)*(l+1);
                }
       		}
			System.out.println(count);
		}
    }
}