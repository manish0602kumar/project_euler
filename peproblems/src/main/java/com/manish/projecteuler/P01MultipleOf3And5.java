/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.projecteuler;

/**
 *
 * @author manish If we list all the natural numbers below 10 that are multiples
 * of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the
 * sum of all the multiples of 3 or 5 below 1000.
 */
public class P01MultipleOf3And5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SumOf3and5Multiples(3, 5, 1000);
    }

    /**
     * Calculate the sum of multiple of 3 and 5
     * @param firstMultiple
     * @param secondMultiple
     * @param range
     */
    public static void SumOf3and5Multiples(int firstMultiple, int secondMultiple, int range ) {
        //starting position to be 3 as lowest multiple is 3
        int pos = 3, sum = 0;
        while (pos < range) {
            if (pos % firstMultiple == 0 || pos % secondMultiple == 0) {
                sum = sum + pos;
            }
            pos++;
        }
        System.out.println("sum of all the multiples of 3 or 5 below 1000 is: " + sum);
    }

}
