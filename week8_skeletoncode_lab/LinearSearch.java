/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author Luis Mendez
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        int x = 2;
        int index = search(list, x);
        if (index == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number is at index" + index);
        }
    }
    
}

/*The time complexity for this function is O(n). This is because 
the function uses a  for loop to iterate through the array of 
integers. This means that the function iterates once for each 
element in the array. Each operation in the for loop is done once
for each element in the array, or n times.*/