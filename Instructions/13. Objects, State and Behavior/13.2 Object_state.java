// Object State

// State refers to the attributes of an object.
// State can be defined using instance variables, or instance fields, which are placed inside of a class.

// Creating Instance Fields
// To create an instance field, initialize variables inside the class container:

class Cat {
  // instance fields:
  String noise = "meow";
  int numLives = 9;
 
  public Cat(){
    // Instructions for creating an instance of Cat goes here:
  }
 
  public static void main(String[] args) {
    Cat myCat = new Cat();
  }
}

// To access an object’s instance fields, append the dot operator followed by the instance field’s name to the name of the object:

Cat myCat = new Cat();
// Access instance variable of an object:
System.out.println(myCat.noise); // Prints: meow



