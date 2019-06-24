package SW_D1;
import java.util.*;
public class Solution_2063_중간값찾기 {

	static int n;
	static int []list = new int[200];
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = 0; i<n; i++)
		{
			list[i] = sc.nextInt();			
		}
		Arrays.sort(list);
		System.out.println(list[n/2+1]);
	}

}
