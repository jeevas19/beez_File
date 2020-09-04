import java.util.Scanner;
public class Missing_Number {

	public static void main(String[] args) {
		int arr[]= {1,2,4,6,3,7,8};
		int flag=0;
		for(int i=1;i<9;i++) {
			flag=0;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("The missing number from 1 to 8 is "+i);
			}
		}
	}

}
