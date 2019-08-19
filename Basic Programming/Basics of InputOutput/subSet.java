import java.util.*;
class subSet{
	 public static void main(String[] args) {    
        String str = "GAME";
		int len=str.length();		
        int n = len*(len+1)/2;  
		int temp=0;	
        String subSet[] = new String[n];       
        for(int i = 0; i<len; i++) {    
            for(int j=i;j<len;j++){
				subSet[temp]=str.substring(i,j+1);
				temp++;
			}
        }  
		Arrays.sort(subSet);	
        System.out.println("The subString are:");    
        for(int i=0;i<n;i++){
				System.out.print(subSet[i]+" ,");
		}
    }    
}   