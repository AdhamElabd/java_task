/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.*;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author dell
 */
public class Array {

    //1. TO return The Max value
    public static int findMax(int[] a, int i, int j) {

        int max = a[i];
        for (int l = 0; l < j; l++) {
            if (a[l] > max) {
                max = a[l];

            }
        }
        return max;
    }

    //2. To Return MaxPos
    public static int findMaxPos(int[] a, int i, int j) {

        int max = a[i];
        for (int l = 0; l < j; l++) {
            if (a[l] > max) {
                max = a[l];
            }
            int q = 0;

            if (a[i] == q) {
                return q;
            } else {
                i += 1;
            }

        }
        return ArrayUtils.indexOf(a, max);

    }

    // 3. to find min
    public static int findMin(int[] a, int i, int j) {

        int min = a[i];
        for (int l = 0; l < j; l++) {
            if (a[l] < min) {
                min = a[l];
            }
        }
        return min;
    }

    //4. to find min position
    public static int findMinPos(int[] a, int i, int j) {

        int min = a[i];
        for (int l = 0; l < j; l++) {
            if (a[l] < min) {
                min = a[l];
            }
//            int q = 0;
//
//            if (a[i] == q) {
//                return q;
//            } else {
//                i += 1;
//            }

        }
        return ArrayUtils.indexOf(a, min);
    }

    //5.to swap position between two numbers
    public static int[] swap(int[] A, int i, int j) {

        int[] b = new int[2]; //First to fill first number //Secont to Fill 2nd number
        b[0] = i;
        b[1] = j;
        A[i] = b[1];
        A[j] = b[0];
        return A;
    }

    //6 Shift Right
    public static void shiftRight(int[] A, int i, int j) {

        for (int k = i; k < j; k++) {
            A[k] = A[k + 1];
        }
    }

    //7 Shift left
    public static void shiftLeft(int[] A, int i, int j) {
        for (int k = j; k > i; k--) {
            A[k] = A[k - 1];
        }
    }

    //8 to generate random array
    public static int[] createRandomArray(int size, int min, int max) {
        Random r = new Random();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = r.nextInt((max - min) + min);

        }
        return A;
    }

    //9 Create Random Matrix
    public static int[][] createRandomMatrix(int rows, int cols, int min, int max) {
        int[][] A = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = random.nextInt(max - min + 1) + min;
                // A[i][j]
                //       = // random from min to     max 
            }
        }
        return A;
    }

    //10 to copy Array
    public static int[] copyArray(int[] A) {
        int[] b = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            b[i] = A[i];
        }
        return b;
    }

    //11 to copy matrix
    public static int[][] copyMatrix(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            System.arraycopy(B[i], 0, A[i], 0, A[0].length); // for(int j = 0 ; j<A[0].length;j++){
//for(int j = 0; j<A[0].length;j++){            
//   A[i][j] = B[i][j];  
// }

        }
        return B;
    }

//12. To find Number
    public static int findInArray(int[] A, int q) {
    
        return ArrayUtils.indexOf(A, q);
    }

    //13. find number after sorted
    public static int findInSortedArrary(int[] A, int q) {
        Arrays.sort(A);
        return ArrayUtils.indexOf(A, q);
    }

    //14 Find Q in sorted Array
    public static int findFirstInSortedArrary(int[] A, int q) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == q) {
                return ArrayUtils.indexOf(A, q);
            }
        }
        return -1;
    }

}
