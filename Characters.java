import java.util.*;
public class Characters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Beezlabs provides solution that will help the mankind working ways beyond thier imagination and provide platform using the latest cutting edge technologies");
		String s="Beezlabs provides solution that will help the mankind working ways beyond thier imagination and provide platform using the latest cutting edge technologies";
		int count=0;
		int i=0;
		while(i!=s.length()){
		    if(s.charAt(i)!=' '&&((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))){
		        count++;
		    }
		    i++;
		}
		System.out.println("Number of Characters : "+count);

	}

}
