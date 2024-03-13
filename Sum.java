import java.util.Arrays;
public class Sum{
	public static void main(String[] args){
		int arr[]={10,51,53,39,47,44,21};
		Arrays.sort(arr);
		int n=arr.length;
		int ans=arr[n-2]+arr[n-3];
		System.out.print("Sum of 2nd and 3rd largest number is: "+ans);
	}
}
