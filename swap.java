import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X,Y;
		System.out.println("Enter x and y");
		X=sc.nextInt();
		Y=sc.nextInt();
		System.out.printf("Before Swapping\nx = %d\ny = %d",X,Y);
		X=X+Y;
		Y=X-Y;
		X=X-Y;
		System.out.printf("\nAfter Swapping\nx = %d\ny = %d", X,Y);
		
	}

}
