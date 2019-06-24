package SW_D1;
import java.util.*;
public class Solution_2072_홀수만더하기 {

	static int T;
	static int sum=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	T = sc.nextInt();
		
		for(int t = 1; t<=T; t++)
		{
			int sum =0;

			for(int i = 0; i<10; i++)
			{
				int []b = new int[10];
				b[i] = sc.nextInt();
				
				if(b[i] % 2 == 1)
				{
					sum += b[i]; 
				}
								
			}
			System.out.println("#" + t + " " + sum);
		}		
	}
}
