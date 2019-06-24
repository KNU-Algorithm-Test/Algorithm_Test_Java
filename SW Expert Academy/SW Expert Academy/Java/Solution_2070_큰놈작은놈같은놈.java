package SW_D1;
import java.util.*;
public class Solution_2070_Å«³ğÀÛÀº³ğ°°Àº³ğ {

	static int a, b, T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int t = 1; t<=T; t++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a<b)
			{
				System.out.println("#" + t + " " + "<");
			}
			else if(a==b)
			{
				System.out.println("#" + t + " " + "=");
			}
			else if(a>b)
			{
				System.out.println("#" + t + " " + ">");
			}
			
		}
	}
}
