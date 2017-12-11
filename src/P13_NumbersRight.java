/*
  	ISYS 320
  	Name(s): Patrick Quirk
  	Date: 12-10-17
*/

public class P13_NumbersRight {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int k = 5; k >= i; k--)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)			
				System.out.print(i);
			
			System.out.println("");
		}
	}

}
