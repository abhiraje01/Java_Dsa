class Highest_Repeating{
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,2,3,3,4};

		boolean [] b = new boolean[arr.length];
		int max=Integer.MIN_VALUE;
		int highEle=0;

		for (int i=0;i<arr.length ;i++ ) {
			if (b[i])continue;
			int cnt=0;
			for (int j=0;j<arr.length ;j++ ) {
				if (arr[i]==arr[j] && b[j]==false) {
					cnt++;
					b[j]=true;
				}
			}
			if (max<cnt) {
				max=cnt;
				highEle=arr[i];
			}

			
		}
		System.out.println(highEle + " is highly repeated "  + max + " times");
	}
}