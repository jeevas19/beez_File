import java.util.Scanner;
public class AddingDigitsUntilSingleDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		while(N>9) {
			int sum=0;
			while(N>0) {
				sum+=N%10;
				N/=10;
			}
			N=sum;
		}
		System.out.println(N);
	}

}
