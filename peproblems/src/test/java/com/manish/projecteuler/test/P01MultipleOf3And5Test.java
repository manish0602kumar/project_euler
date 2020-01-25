/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.projecteuler.test;

import com.manish.projecteuler.P01MultipleOf3And5;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class contains test case for P01MultipleOf3And5 class
 *
 * @author manish
 */
public class P01MultipleOf3And5Test {

    @Test
    public void testSumOf3and5Multiples() {
        Assert.assertEquals(233168, P01MultipleOf3And5.SumOf3and5Multiples(3, 5, 1000));
        System.out.println("Ok Tested for " + P01MultipleOf3And5.class.getName());
    }

}
