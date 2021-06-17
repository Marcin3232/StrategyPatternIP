/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.ISortStrategy;

import java.util.stream.IntStream;

/**
 * @author LeopardProMK
 */
public class Bubblesort implements ISortStrategy {

    @Override
    public void sort(double[] doubleTab) {
        int n = doubleTab.length;
        IntStream.range(0, doubleTab.length - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    if (doubleTab[j - 1] > doubleTab[j]) {
                        double temp = doubleTab[j];
                        doubleTab[j] = doubleTab[j - 1];
                        doubleTab[j - 1] = temp;
                    }
                });
    }
}
