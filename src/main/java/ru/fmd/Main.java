package ru.fmd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] offsetSortedArray = new Random().ints(50,1,20).toArray();
        Arrays.sort(offsetSortedArray);

        for (int i = 0; i < offsetSortedArray.length; i++) {
            int[] shiftedArr = shiftArr(offsetSortedArray, i);

            for (int k : shiftedArr) {
                System.out.printf("%s ", k);
            }
            System.out.printf("Min element = %s", getMinElement(shiftedArr));
            System.out.println();
        }
    }

    public static int getMinElement(int[] array){
        int left = 0;
        int right = array.length-1;
        int mid;

        while(right-left > 1){
            if(array[left] < array[right])
                return array[left];

            mid = Math.floorDiv (left+right,2);

            if(array[left] <= array[mid])
                left = mid+1;
            else
                right = mid;
        }
        return Math.min(array[left], array[right]);
    }

    public static int[] shiftArr(int[] sortedArr, int offset) {
        List<Integer> shiftedList = new ArrayList<>();
        for (int i = 0; i < sortedArr.length; i++){
            int offsetIndex = sortedArr.length - offset + i;
            if(offsetIndex >= sortedArr.length)
                offsetIndex-=sortedArr.length;
            shiftedList.add(sortedArr[offsetIndex]);
        }
        return shiftedList.stream().mapToInt(Integer::intValue).toArray();
    }
}

