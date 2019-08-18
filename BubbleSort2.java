import java.util.*;
class BubbleSort2{
	public static void main(String args[]){
		int i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of element to sort");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("\nEnter "+n+" Integer to be sorted");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("\n\nThe are to be sorted are");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n\n\nThe sorted array is");
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//System.out.println("\n\n\nThe sorted array is");
		for(i=0;i<arr.length;i++)
		System.out.print(arr[i]+ " ");
	
	}
}
					
			