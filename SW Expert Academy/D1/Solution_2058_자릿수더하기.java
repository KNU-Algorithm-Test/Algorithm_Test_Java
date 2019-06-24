package SW_D1;
import java.util.*;
public class Solution_2058_ÀÚ¸´¼ö´õÇÏ±â {

	static int n, sum;
	static int []list = new int[5];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = 3; i>=0; i--)
		{
			list[i] = n%10;
			n = n/10;
			sum += list[i];
		}
		
		System.out.println(sum);
	}

}
