import java.util.*;
class BestIndex{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long prefixSum[] = new long[n];
        prefixSum[0] = arr[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        long specialValue = Integer.MIN_VALUE ;
        for(int i=0;i<n;i++){
            int s=0,y=1;
            int x=i;
            while(x<=n){
                x=x+y;
                y++;
            }
            s=x-y+1;
            if(i==0){
				arr[i]=prefixSum[s-1];
			}
			else{
				arr[i]=prefixSum[s-1]-prefixSum[i-1];
			}
			if(arr[i]>specialValue)
				specialValue=arr[i];
		}
		System.out.println(specialValue);
    }
}