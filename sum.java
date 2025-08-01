class sum{
	public static void main(String[] args) {
		int [] arr ={ 50,55,60};
		int [] arr2 ={60,55,50,65};
		int op=0;
		
		
		for (int i : arr2) {
			int sum=0;
			int cnt=0;
			int sum1=0;
			for (int j : arr) {
				sum=i-j;
				cnt++;
				if(cnt==3)
				{
					sum1+=sum;
					System.out.println(sum1);
				}
				// op=op+sum;
				
				// System.out.println(sum);
				// System.out.println(cnt);

			}
		}


	}
}