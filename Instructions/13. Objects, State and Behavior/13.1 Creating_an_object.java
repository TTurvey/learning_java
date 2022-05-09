// Creating an Object


// Objects and classes are closely related because classes define the attributes and behaviors of an object.
// To create an object declare a variable in the main() method with the class name as the data type and set the value to a call to the class’ constructor:

class Cat {
  // Class constructor:
  public Cat(){
    // Instructions for creating an instance of Cat goes here:
  }
 
  public static void main(String[] args) {
    // Create a Cat object by calling the constructor:
    Cat myCat = new Cat();
  }
}

// The class name is used as the data type because objects have reference data types meaning that the value of the variable is a reference to an instance’s memory address.



