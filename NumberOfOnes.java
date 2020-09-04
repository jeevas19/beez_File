import java.util.Scanner;
public class NumberOfOnes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
			int num=i;
			while(num>0) {
				if(num%10==1) {
					count++;
				}
				num/=10;
			}
		}
		System.out.println(count);

			}

}
