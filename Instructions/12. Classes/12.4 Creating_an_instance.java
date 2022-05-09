// To create an instance, we need to call or invoke the constructor within main().
// The following example assigns a Car instance to the variable ferrari:

public class Car {
 
  public Car() {
    // Instructions for creating a Car instance
    System.out.println("I'm a constructor!");
  }
 
  public static void main(String[] args) {
    // Invoke the constructor:
    Car ferrari = new Car(); 
  }
}

// In this example, instead of being declared with a primitive data type like int or boolean, our variable ferrari is declared as a reference data type.
// This means that the value of our variable is a reference to an instance’s memory address.
// During its declaration, the class name is used as the variable’s type.
// In this case, the type is Car.

// After the assignment operator, (=),
// we invoke the constructor method: Car(),
// and use the keyword new to indicate that we’re creating an instance.
// Omitting new causes an error.

// If we were to output the value of ferrari we would see its memory address like so:

Car@76ed5528