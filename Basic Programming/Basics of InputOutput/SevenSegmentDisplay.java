import java.util.*;
class SevenSegmentDisplay{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			String n = sc.next();
			int sum=0;
			for(int j=0;j<n.length();j++){
				if(n.charAt(j)=='0' || n.charAt(j)=='6' || n.charAt(j)=='9'){
					sum+=6;
				}
				else if(n.charAt(j)=='1'){
					sum+=2;
				}
				else if(n.charAt(j)=='7'){
					sum+=3;
				}
				else if(n.charAt(j)=='4'){
					sum+=4;
				}
				else if(n.charAt(j)=='5' || n.charAt(j)=='2' || n.charAt(j)=='3'){
					sum+=5;
				}
				else if(n.charAt(j)=='8'){
					sum+=7;
				}
			}
			if(sum%2==0){
				for(int j=0;j<sum/2;j++){
					System.out.print("1");
				}
			}
			else{
				System.out.print("7");
				sum=sum-3;
				for(int j=0;j<sum/2;j++){
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
						
				
				