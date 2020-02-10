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

