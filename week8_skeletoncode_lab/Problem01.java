/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author Luis Mendez
 */
public class Problem01 {

public static long primeSum (int n) {
    long sum = 0;
    for (int i = 2; i <= n; i++) {
        boolean prime = true;
        for (int j = 2; j*j <= i; j++) {
            if (i % j == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            sum += i;
        }
    }
    return sum;
}

    public static void main(String[] args) {
    int n = 15;
    System.out.println("Prime Sum: " + primeSum(n));
  }
}


/*
The time complexity for this method is O(n sqrt(n)). This is because the outermost 
for loop iterates n times, n being the size of the input. The outer for loop 
iterates until i <= n. The inner for loop iterates until j * j <= i
which means the operations inside run on average sqrt(n) times. The space complexity
for this function is O(1) since the number of variables holding information doesnt
change with the size of the input.
*/
