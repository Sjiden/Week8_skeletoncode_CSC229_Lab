/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {
    
    
    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                // compare adjacent elements and swap if needed
                if (a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 8, 2, 5};
        int n = arr.length;

        System.out.println("Unsorted array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        bubbleSort(arr, n);

        System.out.println("Sorted array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}

/*The time complexity for this algorithm is O(n^2). The algorithm iterates 
every operation in the outer four loop once for each element input so the 
operations in the outer loop occur n times. The operations in the inner for 
loop also iterate n times. This means that for each iteration of the outer 
loop, the inner four loop iterates n times. So the total number of 
operations is n^2.*/