package SW_D1;
import java.util.*;
public class Solution_2071_평균값구하기 {
	static int T;
	static int []list = new int[11];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int t = 1; t<=T; t++)
		{
			double b = 0;
			for(int i = 0; i<10; i++)
			{
				list[i] = sc.nextInt();
				b += list[i];
			}
			
			System.out.println("#" + t + " " + Math.round(b/10));
		}		
	}

}
