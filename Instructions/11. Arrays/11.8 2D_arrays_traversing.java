// Traversing throuh 2D array
// When traversing through a 2D array, we can iterate using row-major order or column-row order.



// Row-Major Order

// Row-major order for 2D arrays refers to a traversal path that moves horizontally through each row starting at the first row and ending with the last.

// To iterate through a 2D array using row-major order, create a nested for loop.
// 1) The outer loop will iterate from 0 to the length of the 2D array minus 1.
// 2) The nested loop will iterate from 0 to the length of one of the nested arrays minus 1.
// 3) Access the individual element by placing the outer loop’s control variable in the first bracket while placing the inner loop’s control variable in the second bracket:

char[][] letters = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};
 
for (int i = 0; i < letters.length; i++){
  for (int j = 0; j < letters[0].length; j++){
    System.out.print(letters[i][j]);
  }
}
// Prints: AaBbCc



// Column-Major Order
// To iterate through a 2D array using column-major order, create a nested for loop.
// 1) The outer loop will iterate from 0 to the length of one of the nested arrays minus 1.
// 2) The nested loop will iterate from 0 to the length of the 2D array minus 1.
// 3) Access the individual element by placing the inner loop’s control variable in the first bracket while placing the outer loop’s control variable in the second bracket:

char[][] letters = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};
 
for (int i = 0; i < letters[0].length; i++){
  for (int j = 0; j < letters.length; j++){
    System.out.print(letters[j][i]);
  }
}
// Prints: ABCabc