/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
import sort.strategy.SortContext;

import java.util.Arrays;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] dataNonSort = DataGenerator.generate(100000);

        SortContext sortContext = new SortContext(new Selectionsort()); //selecting the sort method
        double time = sortContext.sortedDoubleTab(dataNonSort);

        //testing sorted array
        Arrays.stream(dataNonSort).forEach( x -> System.out.println(x));

        System.out.println("Time: " + time);
    }
}
