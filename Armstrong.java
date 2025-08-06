class Armstrong{
	public static void main(String[] args) {
		int [] arr = {100,1634,3456,8765,2,3};
		for (int ele  : arr) {
			if(isArmstrong(ele)){
				System.out.println(ele + " ");
			}
		}
	}

	public static boolean isArmstrong(int ele){
		int count=0;
		int res=ele;
		int sum=0;

		while(ele>0){
			count++;
			ele/=10;
		}
		ele=res;
		while(ele>0){
			int rem=ele%10;
			int mul=1;
			for (int i=1;i<=count ;i++ ) {
				mul=mul*rem;
			}
			sum=sum+mul;
			ele/=10;
		}
		if(sum!=res)return false;
		return true;
	}
}