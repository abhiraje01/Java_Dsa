import java.util.*;
class char_string{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();

		char[] arr = str.toCharArray();
		boolean flag = false;
		boolean [] b = new boolean[arr.length];

		for (int i=0;i<arr.length ;i++ ) {
				if (b[i]) continue; 
				int cnt=0;
			for (int j=0;j<arr.length ;j++ ) {
				if (arr[i]==arr[j] && b[j]==false) {
					cnt++;
					b[j]=true;
				}
			}
				 if(cnt==1)
				{
					
				System.out.println(arr[i] + ":" + cnt);
				flag =true;
				}
			}
				if(!(flag))
					System.out.println("No Char Found");
		}
	
	}
