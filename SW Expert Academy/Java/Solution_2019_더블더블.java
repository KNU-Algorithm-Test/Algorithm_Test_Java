package SW_D1;
import java.util.*;
public class Solution_2019_더블더블 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 2;
		
		System.out.print("1" + " ");
		for(int i = 1; i<=n; i++)
		{			
			System.out.print(a +" ");
			
			a *= 2;
		}
		
	}

}
