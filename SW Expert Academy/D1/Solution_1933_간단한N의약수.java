package SW_D1;
import java.util.*;
public class Solution_1933_간단한N의약수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			if(n%i == 0)
			{
				System.out.print(i + " ");
			}
		}
	}

}
