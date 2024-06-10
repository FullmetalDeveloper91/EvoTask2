package ru.fmd;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMinElement(new int[]{14,15,16,11,12,13}));
    }

    public static int getMinElement(int[] array){
        int min = array[0];

        for (int j : array)
            if (j < min) {
                min = j;
                break;
            }

        return min;
    }
}