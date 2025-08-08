import java.util.*;
class AntiClockwise_Rotation{
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6};
		System.out.println("Before the rotation " + Arrays.toString(arr));
		System.out.println("Enter the no of rotation: ");
		int rotation= new Scanner(System.in).nextInt();
		anticlockwiseRotation(arr,rotation);
		System.out.println("After Rotation : " + Arrays.toString(arr));
	}
	public static void anticlockwiseRotation(int [] arr,int rotation){

		for (int i=1;i<=rotation ;i++ ) {
			int temp = arr[0];
			for (int j=1;j<arr.length ;j++ ) {
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
	}
}