/*Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

For example, given the 2D array:

-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
We calculate the following  hourglass values:

-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
Our highest hourglass value is  from the hourglass:

0 4 3
  1
8 6 6
Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

Function Description

Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):

arr: an array of integers
Input Format

Each of the  lines of inputs  contains  space-separated integers .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

image
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4
 * 
 * 
 */


package com.hackerrank.interviewpreparationkit.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDimentionalArraySum {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrix[][] = new int[6][6];
        //Read in:
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        
        
        int maxSum = -64; //Because the minimum it could be is -9*7 = -63
        int startCol = 0;
        
        //Each iteration of the outer loop is one hour glass:
        for (int row = 0; row <= 3; row++){
            int sum = 0; //Initialize this specific hourglass' sum
            for (int col = startCol; col < startCol + 3; col ++) {
                sum += matrix[row][col]; //Gets current index that col and row are on
                if (col == startCol)  sum += matrix[row+1][startCol+1];
                sum += matrix[row+2][col]; 
            }
            startCol = (startCol < 3) ? startCol + 1 : 0; 
            if (startCol != 0) row--;           
            if (sum > maxSum) maxSum = sum;
        }   
        System.out.println(maxSum);     
    }
}

