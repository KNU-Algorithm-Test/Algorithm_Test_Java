package SW_D1;
import java.util.*;
public class Solution_2043_서랍의비밀번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		
		for(int i = k; i<=p; i++)
		{
			count += 1;			
		}
		System.out.println(count);
	}
}
