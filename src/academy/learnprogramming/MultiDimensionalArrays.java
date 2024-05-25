package academy.learnprogramming;

public class MultiDimensionalArrays {
  
  public static void main(String[] args) {
    // 1d array
    int[] myArray = {0, 1};

    // 2d array
    int[][] array = new int[2][4]; // 2 rows, 4 columns
    int anotherArray[][] = new int[2][4]; // 2 rows, 4 columns

    int[] myIntArray[] = new int[2][4]; // 2 rows, 4 columns

    String[][] my2dArray = new String[][] {
      {"One", "Two"}, // 1st row 2 elements
      {"Three", "Four", "Five"}, // 2nd row 3 elements
      {"Six", "Seven", "Eight", "Nine"}, // 3rd row 4 elements
      null
    };

   int[][] numberTable = new int[2][3];
    numberTable[0][0] = 1;
    numberTable[0][1] = 2;
    numberTable[0][2] = 3;
    numberTable[1][0] = 4;
    numberTable[1][1] = 5;
    numberTable[1][2] = 6;

    // 3d array
    int[][][] threeArray = new int[3][3][3]; // 3 rows, 3 columns, 3 depth
    threeArray[0][0][0] = 1;

    int oneMoreThreeArray[][][] = new int[3][3][3]; // 3 rows, 3 columns, 3 depth

    int[] anotherThreeArray[][]; // not good practice

    int[][][] threeDArray = {
      {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
      {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
      {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
    };
  }
}
