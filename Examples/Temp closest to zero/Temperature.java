// A Temperature class with a method that receives an array and target value.
// The closest temperature within the array is returned.
// If positive and negative temps of the same magnitude are in the array, then only the positive one is returned.

public class Temperature {
  
  public static void main(String[] args) {

    // test cases for the input arrays
    int[] arr1 = new int[] { 1, 2 };
    int[] arr2 = new int[] { 1, 2, 2 }; 
    int[] arr3 = new int[] { -1, 2 };
    int[] arr4 = new int[] { -1, 1 };
    int[] arr5 = new int[] { 1, -1 };

    // calling the method for each test case
    int result1 = findClosest(arr1, 0);
    int result2 = findClosest(arr2, 0);
    int result3 = findClosest(arr3, 0);
    int result4 = findClosest(arr4, 0);
    int result5 = findClosest(arr5, 0);

    // printing out the test case results
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
  }

  public static int findClosest(int [] array, int target) {
		int index = 0;
		int closestDiff = Math.abs(array[0] - target);  
    
    for (int i = 1; i < array.length; i++) {
      int difference = Math.abs(array[i] - target);

			if (difference < closestDiff) {
				index = i;
				closestDiff = difference;
			}
      if (difference == closestDiff && array[i] > 0) {
        index = i;
      }
		}
		return array[index];
	}

}

