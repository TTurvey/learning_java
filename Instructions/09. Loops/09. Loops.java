// Loops


// while loop
int num = 0;
while (num < 20) {
  num = num + 1;
}
System.out.println(num) // Prints: 20



// A do-while loop is very similar to a while loop.
// The only distinction is that a do-while loop will always execute once before evaluating the condition.
// If the below code loop was simply a while loop, it would never run since 2 does not equal 4.
do {
 System.out.println("2 is equal to 4!");
} while (2 == 4);
// Prints: 2 is equal to 4!



// for loop
// A for loop header is made up of:
// The initialization of the loop control variable.
// A boolean expression.
// An increment or decrement statement.
for (int i = 0; i <= 10; i++) {
  System.out.println(i);
}


// for-each loop
for (String s : myArray) {
  // Do something
}


// The break keyword is used to exit, or break, a loop.
// Once break is executed, the loop will stop iterating.
// For example:
for (int i = 0; i < 10; i++) {
  System.out.println(i);
  if (i == 4) {
    break;
  }
}

// The continue keyword can be placed inside of a loop
// if we want to skip an iteration.
// If continue is executed, the current loop iteration will immediately end, 
// and the next iteration will begin.
// We can use the continue keyword to skip any even valued iteration:
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
  if (numbers[i] % 2 == 0) {
    continue;
  }
  System.out.println(numbers[i]);
}
