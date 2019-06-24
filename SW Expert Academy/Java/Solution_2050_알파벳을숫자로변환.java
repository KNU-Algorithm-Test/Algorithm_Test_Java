package SW_D1;
import java.util.*;
public class Solution_2050_알파벳을숫자로변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		for(int i = 0; i<26; i++)
		{
			int a = (st.charAt(i)-64);
			System.out.print(a + " ");
		}		
	}

}
