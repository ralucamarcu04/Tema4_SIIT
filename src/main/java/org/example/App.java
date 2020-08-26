package org.example;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        SalesRepresentative Rep = new SalesRepresentative();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0,Rep.reps(8,200));
        array.add(1,Rep.reps(10,300));
        array.add(2,Rep.reps(3,100));
        array.add(3,Rep.reps(12,500));
        Rep.sortedReps(array.toArray(new Integer[0]));
        Rep.printReps(array.toArray(new Integer[0]));

    }
}

