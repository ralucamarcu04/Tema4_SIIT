package org.example;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;

public class SalesRepresentative {
    public int reps(Integer sales, Integer quota){
        Integer amount = sales * quota;
        return amount;
    }

    public void sortedReps(Integer[] array){
        int n = array.length;
        int aux;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (array[j] < array[j+1]){
                    aux = array[j];
                    array[j] = array [j+1];
                    array[j+1] = aux;
                }
            }
        }
    }
    public void printReps(Integer [] array){
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
