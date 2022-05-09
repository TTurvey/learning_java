// / Defining State with Parameters

// To create dynamic objects, parameters can be added to the class constructor.
// Instance variables can then be assigned the parameter values:

class Cat {
  // Instance fields:
  String noise;
  int numLives = 9;
 
  // Constructor takes in one String parameter
  public Cat(String animalNoise){
    // Assign instance variable to parameter value:
    noise = animalNoise;
  }
 
  public static void main(String[] args) {
    // Send argument to constructor when creating an object:
    Cat firstCat = new Cat("mew"); 
    // Send argument to constructor when creating another object:
    Cat secondCat = new Cat( "mow");
 
    System.out.println(firstCat.noise); // Prints: mew
    System.out.println(secondCat.noise); // Prints: mow
  }
}

