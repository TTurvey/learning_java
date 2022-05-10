import java.util.*; 

public class Factory {
  
  public static void main(String[] args) {
    // testing standard
    String result1 = findStack(100, 100, 100, 100);
    // testing special -> bulky by volume
    String result2 = findStack(149, 100, 100, 100);
    // testing special -> bulky by dimension
    String result3 = findStack(151, 10, 10, 100);
    // testing special -> heavy by mass
    String result4 = findStack(100, 100, 100, 121);
    // testing rejected -> heavy and bulky 
    String result5 = findStack(149, 100, 100, 121);
    // testing rejected -> heavy and bulky 
    String result6 = findStack(151, 10, 10, 121);

    // printing test case results
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
  }

  public static String findStack(int height, int width, int length, int mass) {

    boolean heavy = false;
    boolean bulky = false;

    int volume = height * width * length;

    int[] dimensions = {height, width, length};
    Arrays.sort(dimensions);

    //  if volume is larger than 1,000,000cm or a single dimension is larger 150cm then item is bulky.
    if ( volume > 1000000 ) { bulky = true; }
    if ( dimensions[2]  > 100 ) { bulky = true; }
  
    // if mass is larger than 120kg then item is heavy.
    if (mass > 120) { heavy = true; }

    // if neither bulky or heavy then send item to the standard stack.
    // if either bulky or heavy then send item to the rejected stack.
    // if both bulky and heavy then send item to the special stack.
    return (bulky == false && heavy == false) 
    ? "STANDARD" : (bulky == true && heavy == true)
    ? "REJECTED" : "SPECIAL";
  }
  
}

