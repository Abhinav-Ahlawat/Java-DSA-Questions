import java.util.Scanner;
public class secondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int secondLargest= -1;
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("Second largest element in the array is - "+secondLargest);
	}

}
