package edu.uoc.ds.adt;

import java.util.Arrays;

public class PR0Array {

    public final int CAPACITY = 50;

    private int [] array;

    //Constructor
    public PR0Array () {
        newArray();
    }

    public void newArray() {
        array = new int [CAPACITY];
        fillArray();

    }

    public void fillArray() {
        int x = 0;

        for(int i = 0; i < CAPACITY; i++){
            array[i] = x;
            x+=2;
        }
    }


    public int[] getArray() {
        return this.array;
    }

    public int getIndexOf(int number){
        int index = -1;

        for(int i = 0; i<this.array.length; i++) {
            if (this.array[i] == number){
                index = i;
                break;
            }
        }

        return index;
    }

    public int binarySearch(int bin){
        int index = 0;

        index = searchIndex(this.array, bin, index);
        return index;
    }

    public int searchIndex(int[] numbers, int num, int index) {
        int size = numbers.length;
        int middle = size/2;

        if (numbers[middle] == num && index == 0)
            return index + middle;
        else if (numbers[middle] == num)
            return index + 1;
        else if (size == 1) {
            index = -1;
            return index;
        } else if (size == 2 && numbers[0] == num) {
            return index;
        }
        else if (numbers[middle] > num){
            return searchIndex(Arrays.copyOfRange(numbers,0,middle),num, index);
        }
        else {
            index += middle + 1;
            return searchIndex(Arrays.copyOfRange(numbers,middle+1,size),num, index);
        }
    }
}
