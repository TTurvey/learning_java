// The this Keyword


// The this keyword is used to reference the current object within any class method or constructor.
// The this keyword can be useful in clarifying what value is being referred to if any parameter values use the same name as an instance variable.

// To use the this keyword, prepend this followed by . to the instance variable:

class Cat {
  String noise;
  int numLives = 9;
 
  // Parameter has same name as the instance variable
  public Cat(String noise){
    // Assign instance variable to parameter value:
    this.noise = noise;
  }
}

