package SW_D1;
import java.util.*;
public class Solution_2056_연월일달력 {
	
	static int T;
	static int rmonth, rday;
	static String n, year, month, day;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int t = 1; t<=T; t++)
		{
			n = sc.next();
			
			year = n.substring(0, 4);
			month = n.substring(4, 6);
			day = n.substring(6);
			
			rmonth = Integer.parseInt(month);
			rday = Integer.parseInt(day);
			
			if(rmonth > 12 || rmonth <1) System.out.println("#" + t + " " +"-1");
			
			if(rmonth<=7 && rmonth%2 ==0)
			{
				if(rday<1 && rday>30) System.out.println("#" + t + " " +"-1");
				if(rmonth == 2) if(rday > 28) System.out.println("#" + t + " " +"-1");			
				else
				{
					System.out.println("#" + t + " " + year + "/" + month + "/" + day);
				}
			}
			
			if(rmonth<=7 && rmonth%2 !=0)
			{
				if(rday<1 && rday>31) System.out.println("#" + t + " " +"-1");
				else
				{
					System.out.println("#" + t + " " + year + "/" + month + "/" + day);
				}
			}
			
			if(rmonth>7 && rmonth%2 ==0)
			{
				if(rday<1 && rday>30) System.out.println("#" + t + " " +"-1");
				else
				{
					System.out.println("#" + t + " " + year + "/" + month + "/" + day);
				}
			}
			
			if(rmonth>7 && rmonth%2 !=0)
			{
				if(rday<1 && rday>31) System.out.println("#" + t + " " +"-1");
				else
				{
					System.out.println("#" + t + " " + year + "/" + month + "/" + day);
				}
			}
		}		
	}
}
