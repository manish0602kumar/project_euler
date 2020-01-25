/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author manish
 *
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 */
public class P03LargestPrimeFactor {

    public static final Logger log = Logger.getLogger(P03LargestPrimeFactor.class.getName());

    public static void main(String[] args) {
        largestPF(600851475143L);

    }

    public static long largestPF(Long divendNumber) {
        long num = divendNumber;
        int largestPFNumber = 1;
        for (int divisor = 2; divisor <= divendNumber  ; divisor++) {

            while (divendNumber % divisor == 0) {
                System.out.println("Prime Factor of " + num + " is " + divisor);
                if (largestPFNumber < divisor) {
                    largestPFNumber = divisor;
                }
                divendNumber = divendNumber / divisor;
            }
        }
        System.out.println("Largest Prime Factor of " + num + " is " + largestPFNumber);
        return largestPFNumber;
    }

}
