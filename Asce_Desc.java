import java.util.Arrays;
class Asce_Desc{
	public static void main(String[] args) {
		
	
	int [] arr= {3,4,8,5,3,5,9,8,6,5,4,3,2,1};
	System.out.println(Arrays.toString(arr));
	sortAscending(arr);
	System.out.println(Arrays.toString(arr));
	sortDescending(arr);
	System.out.println(Arrays.toString(arr));
}
		//Ascending Sorting
	public static void sortAscending(int [] arr){
		for (int i=0;i<arr.length;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
		//Descending Sorting
	public static void sortDescending(int [] arr){
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}


}