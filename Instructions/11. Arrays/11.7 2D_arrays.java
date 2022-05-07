// To declare a 2D array, state the data type of the arrays it will hold followed by two square brackets and the 2D array’s name:

// 2D int array
int[][] nums;

// To declare and populate a 2D array using one line of code, place each individual array within curly brackets and separate them using commas:

int[][] nums = {{10, 9, 8}, {7, 6, 5}, {4, 3, 2}}; 



// To access an individual element in a 2D array, state the array name followed by two square brackets:

// The first bracket should hold the index of the individual array the element exists in.
// The second bracket should store the index of the element within that individual array.
int[][] nums = {{10, 9, 8}, {7, 6, 5}, {4, 3, 2}}; 
// Within the first array, access the second element:
System.out.println(nums[0][1]); // Prints: 9


// To update an element’s value, select the element via its index and use the assignment operator to set a new value:
char[][] letters = {{'A', 'a'}, {'B', 'x'}, {'C', 'c'}};
 
// Update the value:
letters[1][1] = 'b';
System.out.println(letters[1][1]); // Prints: b



// To create an empty 2D array, we must specify
// 1) the data type,
// 2) the number of arrays the 2D array will contain,
// 3) and the number of elements that will be contained within each individual array:

// This will create an int array with 2 arrays containing 3 elements each:
int[][] intArray = new int[2][3];


// To populate an empty array, select the index of an element and use the assignment operator to set a value:
int[][] intArray = new int[2][3];
 
intArray[0][0] = 1;
intArray[0][1] = 2;
intArray[0][2] = 4;
intArray[1][0] = 1;
intArray[1][1] = 3;
intArray[1][2] = 6;




