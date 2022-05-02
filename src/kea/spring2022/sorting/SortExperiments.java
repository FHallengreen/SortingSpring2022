package kea.spring2022.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortExperiments {
    public static void main(String[] args) {
        SortExperiments app = new SortExperiments();
//        app.sort1();
//        app.sort2();
//        app.sortBalls1();
        //app.sort3();
        //app.sort4();
//        app.sortBalls2();
//        app.sortBalls3();

//        app.sortPersons1();
//        app.sortPersons2();

        app.sortBalls4();
    }

    public void sort1() {
        int [] numbers = {2,7,3,1,9,4,6,5,10,8};

        System.out.println("Før sortering: " + Arrays.toString(numbers));
        QuickSort sorter = new QuickSort();
        sorter.sort(numbers);
        System.out.println("Efter sortering : " +Arrays.toString(numbers));
    }
    public void sort2() {
        String [] words = {"Bæver", "Kylling", "And", "Vildsvin", "Abe"};

        System.out.println("Før sortering: " + Arrays.toString(words));
        QuickSortStrings sorter = new QuickSortStrings();
        Arrays.sort(words);
        System.out.println("Efter sortering : " +Arrays.toString(words));

    }

    public void sortBalls1() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));

        System.out.println("Efter sortering : " +Arrays.toString(ballsarray));

    }

    public void sort3() {
        // TODO: Skriv koden til sorteringsøvelse 3 (med quicksort) her i denne metode!
    }

    public void sort4() {
        // TODO: Skriv koden til sorteringsøvelse 4 (med quicksort) her i denne metode!
    }

    public void sortBalls2() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        QuickSortSammenlignbar sorter = new QuickSortSammenlignbar();
        sorter.sort(ballsarray);
        System.out.println("Efter sortering : " +Arrays.toString(ballsarray));

    }

    public void sortBalls3() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        QuickSortSammenlignbar sorter = new QuickSortSammenlignbar();
        sorter.sort(ballsarray);
        System.out.println("Efter sortering : " +Arrays.toString(ballsarray));

    }

    public void sortPersons1() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        QuickSortSammenlignbar sorter = new QuickSortSammenlignbar();
        sorter.sort( arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortPersons2() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortBalls4() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        // TODO: Sorter array af balls med Arrays.sort
        Arrays.sort(ballsarray);
        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));

    }


}
