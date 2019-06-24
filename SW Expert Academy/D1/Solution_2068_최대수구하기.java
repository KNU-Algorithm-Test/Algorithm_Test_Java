package SW_D1;
import java.util.*;
public class Solution_2068_최대수구하기 {
	
	static int T;
	static int list[] = new int[11];
	static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		for(int t = 1; t<=T; t++)
		{
			for(int i = 0; i<10; i++)
			{
				list[i] = sc.nextInt();			
				max = max <list[i] ? list[i] : max;
					
			}
			System.out.println("#" + t + " " + max);
			max = 0;
		}		
	}

}
