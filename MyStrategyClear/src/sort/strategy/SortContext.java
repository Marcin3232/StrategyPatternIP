package sort.strategy;

import java.util.Arrays;

public class SortContext {

    private final ISortStrategy iSortStrategy;

    public SortContext(ISortStrategy iSortStrategy) {
        this.iSortStrategy = iSortStrategy;
    }

    public double sortedDoubleTab(double[] doubleTab){
        Stopwatch stopwatch=new Stopwatch();
        iSortStrategy.sort(doubleTab);
        return stopwatch.elapsedTime();
    }

}
