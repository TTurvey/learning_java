// Scope defines the environment in which data is available within a program.
// Method scope dictates what variables accessible within a method.
// Variables that are created within a method are only accessible inside the method it was created.
// If we try referencing a method variable outside its method, we would receive an error message.

// The following code would produce an error because 
// the `main()` method references the `msg` variable which is only available inside the `scopeExample()` method:

public static void scopeExample() {
  String msg = "This value is only accessible within this method";
}
public static void main(String[] args) {
  System.out.println(msg);
}