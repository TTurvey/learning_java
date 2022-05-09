// Object Behavior

// Non-Static Methods
// In order to give behavior to objects, we need to create non-static methods.
// A non-static method is a method that belongs to a class.
// A non-static method can be identified by the lack of the static keyword in the method signature:

class Cat {
  String noise;
  int numLives = 9;
 
  // Non-static method:
  public void speak() {
    System.out.println(noise);
  }
 
  public Cat(String animalNoise){
    noise = animalNoise;
  }
 
  public static void main(String[] args) {
    Cat myCat = new Cat("mew");
  }
}


// A non-static method can only be invoked by an object of the class in which the method was created.
// To call a non-static method, state the object’s name followed by ., the method name, and parentheses:

Cat myCat = new Cat("mew");
// Invoke non-static method on an object:
myCat.speak(); // Prints: mew






