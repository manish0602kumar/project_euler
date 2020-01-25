/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.projecteuler.test;

import com.manish.projecteuler.P03LargestPrimeFactor;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class contains test case for P03LargestPrimeFactor
 * 
 * @author manish
 */
public class P03LargestPrimeFactorTest {
    
    @Test
    public void testlargestPF() {
        Assert.assertEquals(6857, P03LargestPrimeFactor.largestPF(600851475143L));
        System.out.println("Ok Tested for " + P03LargestPrimeFactorTest.class.getName());
    }
    
}
