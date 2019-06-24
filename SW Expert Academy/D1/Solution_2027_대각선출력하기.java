package SW_D1;
public class Solution_2027_대각선출력하기 {
	public static void main(String[] args) {
		/*System.out.println("#++++");
		System.out.println("+#+++");
		System.out.println("++#++");
		System.out.println("+++#+");
		System.out.println("++++#");*/
		
		String arr[] = new String[10];
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<5; j++)
			{
				if(i == j)
				{
					arr[j] = "#";
				}
				else
				{
					arr[j] = "+";					
				}
				System.out.print(arr[j]);
			}
			System.out.println("");
		}
	}
}
