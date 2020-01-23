/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.projecteuler.test;

import com.manish.projecteuler.P02EvenFibonacciNumbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class contains test case for P02EvenFibonacciNumbers class
 * 
 * @author manish
 */
public class P02EvenFibonacciNumbersTest {

    @Test
    public void testSumOf3and5Multiples() {
        Assert.assertEquals(4613732, P02EvenFibonacciNumbers.SumEvenFibonacci(4000000));
        System.out.println("Ok Tested for P02EvenFibonacciNumbers class");
    }    
}
