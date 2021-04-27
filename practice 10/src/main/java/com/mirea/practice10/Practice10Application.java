package com.mirea.practice10;

import com.mirea.practice10.entities.InsertionSort;
import com.mirea.practice10.entities.MergeSort;
import com.mirea.practice10.entities.QuickSort;
import com.mirea.practice10.entities.SortingAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class Practice10Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice10Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.mirea.practice10.entities");

        SortingAlgorithm mergeSort = context.getBean(MergeSort.class);
        SortingAlgorithm insertionSort = context.getBean(InsertionSort.class);
        SortingAlgorithm quickSort = context.getBean(QuickSort.class);

        mergeSort.doSort();
        insertionSort.doSort();
        quickSort.doSort();
    }

}
