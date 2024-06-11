package ru.fmd;

public class Main {
    public static void main(String[] args) {
        //System.out.println(getMinElement(new int[]{14,15,16,11,12,13}));
        int[] offsetSortedArray = new int[]{9,10,11,12,13,14,15,16,17};
        int[] offsetSortedArray1 = new int[]{17,9,10,11,12,13,14,15,16};
        int[] offsetSortedArray2= new int[]{16,17,9,10,11,12,13,14,15};
        int[] offsetSortedArray3 = new int[]{15,16,17,9,10,11,12,13,14};
        int[] offsetSortedArray4 = new int[]{14,15,16,17,9,10,11,12,13};
        int[] offsetSortedArray5 = new int[]{13,14,15,16,17,9,10,11,12};
        int[] offsetSortedArray6 = new int[]{12,13,14,15,16,17,9,10,11};
        int[] offsetSortedArray7 = new int[]{11,12,13,14,15,16,17,9,10};
        int[] offsetSortedArray8 = new int[]{10,11,12,13,14,15,16,17,9};


        //System.out.println(getMinElementLogN(offsetSortedArray1,0,offsetSortedArray.length-1));
        //System.out.println(getMinElementLogN(offsetSortedArray2,0,offsetSortedArray.length-1));
        //System.out.println(getMinElementLogN(offsetSortedArray3,0,offsetSortedArray.length-1));
        //System.out.println(getMinElementLogN(offsetSortedArray,0,offsetSortedArray.length-1));
        //System.out.println(getMinElementLogN(offsetSortedArray4,0,offsetSortedArray.length-1));
        //System.out.println(getMinElementLogN(offsetSortedArray5,0,offsetSortedArray.length-1));
        //System.out.println(getMinElementLogN(offsetSortedArray6,0,offsetSortedArray.length-1));
        //System.out.println(getMinElementLogN(offsetSortedArray7,0,offsetSortedArray.length-1));
        //System.out.println(getMinElementLogN(offsetSortedArray8,0,offsetSortedArray.length-1));

        System.out.println(getMinElementLogN(offsetSortedArray));
        System.out.println(getMinElementLogN(offsetSortedArray1));
        System.out.println(getMinElementLogN(offsetSortedArray2));
        System.out.println(getMinElementLogN(offsetSortedArray3));
        System.out.println(getMinElementLogN(offsetSortedArray4));
        System.out.println(getMinElementLogN(offsetSortedArray5));
        System.out.println(getMinElementLogN(offsetSortedArray6));
        System.out.println(getMinElementLogN(offsetSortedArray7));
        System.out.println(getMinElementLogN(offsetSortedArray8));

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

//    public static int getMinElementLogN(int[] array, int left, int right){
//        int mid = Math.floorDiv (left+right,2);
//        int min = Integer.MAX_VALUE;
//        if(array[mid-1] < array[mid]) {
//            min = Math.min(array[left], array[mid]);
//            left = mid;
//        }
//        else {
//            min = Math.min(array[right],array[mid]);
//            right = mid;
//        }
//
//        if(left==mid || right == mid) return min;
//        else return Math.min(min, getMinElementLogN(array, left, right));
//    }

    public static int getMinElementLogN(int[] array){
        int left = 0;
        int right = array.length-1;
        int mid = Math.floorDiv (left+right,2);
        int min = Integer.MAX_VALUE;
        while(left < mid || right > mid){
            if(array[left] < array[mid]) {
                min = Math.min(array[left],min);
                left = mid;
            }else{
                min = Math.min(array[mid], min);
                right = mid;
            }
            mid = Math.floorDiv (left+right,2);
        }
        return min;
    }
}