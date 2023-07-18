/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author dell
 */
public class Mavenproject2 {

    public static void main(String[] args) {

        int[] array = {1, 5, 9, 3, 5, 4};
        int i = 1;
        int j = 4;
        Array A = new Array();
        int result1 = A.findMax(array, i, j);
        System.out.println("MAx Value is " + result1);

        int result2 = A.findMaxPos(array, i, j);
        System.out.println("MAx Value Pos is " + result2);

        int result3 = A.findMin(array, i, j);
        System.out.println("Min Value is " + result3);

        int result4 = A.findMinPos(array, i, j);
        System.out.println("Min Value Pos " + result4);

        int[] result5 = A.swap(array, i, j);
        System.out.println("the Swap Has Been Done");
        for (int r = 0; r > array.length; r++) {
            System.out.println(result5[r]);

        }

        int[] result8 = A.createRandomArray(10, i, j);
        System.out.println("Random Array :");
        System.out.print("[ ");
        for (int x = 0; x < 10; x++) {
            System.out.print(result8[x] + " ");
        }
        System.out.print("]");
        System.out.println("");
        
        int[][] result = A.createRandomMatrix(3, 3, i, j);
      //  System.out.print(result);
      
        for (int f = 0; f < 3; f++) {

            for (int h = 0; h < 3; h++) {
                System.out.print(result[f][h] + " ");
            }
            System.out.println();
        }
        int[] result10 = A.copyArray(array);
        System.out.println("A copy of array " );
        System.out.print("[ ");
        for(int c = 0 ; c<array.length;c++){
            System.out.print(array[c] + " ");
        }
        System.out.println("]");
    
        int[][] matrix = new int[3][3];
        int[][] result11 = A.copyMatrix(matrix);
        
        int result12 = A.findInArray(array,3);
        System.out.println("index of 4 in array is " + result12);
        
        int result13 = A.findInSortedArrary(array,3);
        System.out.println("index of 4 in sorted array is " +result13);
        
        
        
    }

}
