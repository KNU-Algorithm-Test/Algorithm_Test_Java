package SW_D1;
import java.util.*;
public class Solution_1545_거꾸로출력해보아요 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
//		for(int i = 0; i<=n; i++)
//		{
//			System.out.print(n-i + " ");
//		}
		
		for(int i = n; i >= 1; i--)
		{
			System.out.print(i + " ");
		}
	}

}
