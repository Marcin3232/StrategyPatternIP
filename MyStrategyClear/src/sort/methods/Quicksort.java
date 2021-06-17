/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.ISortStrategy;

import java.util.Arrays;

/**
 *
 * @author LeopardProMK
 */
public class Quicksort implements ISortStrategy {

    @Override
    public void sort(double[] doubleTab) {
        Arrays.stream(doubleTab).sorted();
    }
}
