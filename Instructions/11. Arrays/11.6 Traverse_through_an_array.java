// To traverse an array, use a for loop to iterate from 0 to one less than the length of the array.
// Inside the loop, use the loop control variable to access the element at the current index:

int[] lottoNumbers = {12, 29, 4, 38, 3};
for (int i = 0; i < lottoNumbers.length; i++) {
  // Output the current index value:
  System.out.println(lottoNumbers[i]);
}
/*
Prints:
12
29
4
38
3
*/


// Another option for traversing an array is using a for-each loop:
int[] lottoNumbers = {12, 29, 4, 38, 3};
for (int num: lottoNumbers) {
  System.out.println(num);
}
/*
Prints:
12
29
4
38
3
*/