// The .toString() Method


// If an object is placed inside of a print statement, the output shows the data type of the object (the class name) followed by the memory address of the object:

public static void main(String[] args) {
  Cat myCat = new Cat("mew");
  System.out.println(myCat); // Prints: Cat@6bc7c054
}

// The .toString() method can be added to a class in order to create a unique output when printing an object.
// The original .toString() method exists within the Object class; however, the .toString() method is often overridden in subclasses to create a unique output for each individual class:

class Cat {
  String noise;
  int numLives = 9;
 
  public String toString() {
    System.out.println("The cat with " + numLives + " lives says " + noise);
  }
 
  public Cat(String animalNoise){
    noise = animalNoise;
  }
 
  public static void main(String[] args) {
    Cat myCat = new Cat("mew");
    System.out.println(myCat); // Prints: The cat with 9 lives says mew
  }
}