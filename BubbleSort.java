class BubbleSort{
	public static void main(String args[]){
		int i,j,temp;
		int arr[]= {23,34,3,8,5,43,15};
		System.out.println("Array to be sorted");
		for(i=0;i<arr.length;i++)
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
		//System.out.println("\nThe sorted array is");
		for(i=0;i<arr.length;i++)
		System.out.print(arr[i]+ " ");
	
	}
}