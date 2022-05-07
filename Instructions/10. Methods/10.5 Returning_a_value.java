// To return a value from a function,
// we first must change our method declaration to include the data type of the return value. 
// The return type is placed before the method name.
// To return a value, use the return keyword followed by the return value inside the method body:


// Method will return an int value
public static int findProduct(int num1, int num2) {
  return num1 * num2;
}
public static void main(String[] args) {
  int product = findProduct(3,4);
  System.out.println(product); // Prints: 12
}