/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.projecteuler;

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

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        largestPF(600851475143L);
    }

    /**
     * This Function calculates the largest Prime factor
     *
     * @param inputNumber
     * @return
     */
    public static long largestPF(long inputNumber) {
        long dividendNumber = inputNumber;
        // Intially we are consider the largest Prime factor to be 1
        int largestPFNumber = 1;
        for (int divisor = 2; divisor <= dividendNumber; divisor++) {

            /* checks whether  divisor(i.e loop varible)is a factor of  dividendNumber(i.e inputNumber)
             if yes than make quotient the new divident and add divisor in the list of prime factor
             else increase the divisor and try again  */
            while (dividendNumber % divisor == 0) {
                System.out.println("Prime Factor of " + inputNumber + " is " + divisor);

                //if this factor of the input number is greater than previously stored largest prime factor than interchange.
                if (largestPFNumber < divisor) {
                    largestPFNumber = divisor;
                }

                // quotient will be the new dividend
                dividendNumber = dividendNumber / divisor;
            }
        }
        System.out.println("Largest Prime Factor of " + inputNumber + " is " + largestPFNumber);
        return largestPFNumber;
    }

}
