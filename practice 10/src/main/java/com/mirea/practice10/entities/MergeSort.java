package com.mirea.practice10.entities;

import org.springframework.stereotype.Component;

@Component
public class MergeSort implements SortingAlgorithm{
    @Override
    public void doSort() {
        System.out.println("Using merge sort");
    }
}
