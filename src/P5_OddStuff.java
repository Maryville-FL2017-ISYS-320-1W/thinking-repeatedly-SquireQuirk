/*
  	ISYS 320
  	Name(s): Patrick Quirk
  	Date: 12-10-17
*/

// 1. Your predicted output 
/*
 * 4
 * 2
 * 1
 * 0
 */


public class P5_OddStuff {
    public static void main( String[] args ) {
        int number = 4;
        for( int count = 1; count <= number; count++ ) {
            System.out.println( number );
            number = number / 2;
        }
    }
}



// 3. Were you correct? Explain any differences and what you learned.
// I was incorrect because I didn't take into account that the number variable in the for statement 
// was also decreasing so the for loop only ran twice instead of four times.