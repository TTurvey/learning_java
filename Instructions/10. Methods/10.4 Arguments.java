// Arguments are the pieces of data that get passed into a method.
// When calling a method, we must place the arguments inside the parentheses of the method call.
// The arguments must be the same data type as the parameters and appear in the same chronological order.

public static void exampleMethod(String greeting, String name) {
  System.out.println(greeting + " " + name);
}

public static void main(String[] args) {
  exampleMethod("Greetings", "Earthling"); // Prints: Greetings Earthling
  exampleMethod("Hello", "World"); // Prints: Hello World
  exampleMethod("Howdy", "Planet"); // Prints: Howdy Planet
}

