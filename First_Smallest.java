class First_Smallest{
	public static void main(String[] args) {
		int [] arr = {1,2,-1,0,4,6,-9};

		int min=Integer.MAX_VALUE;

		for (int ele : arr) {
			if (min>ele) {
				min=ele;
			}
		}
		System.out.println(min);
	}
}