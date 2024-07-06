import java.util.Scanner;
public class checkIfTheArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		boolean isSorted=true;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++) {
			if(arr[i]>=arr[i-1]) {
			}else {
				isSorted=false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}
		
	}

}
