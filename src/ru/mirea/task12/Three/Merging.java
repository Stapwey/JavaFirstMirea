package ru.mirea.task12.Three;
import java.util.Arrays;

public class Merging {
    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low) return;

        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    }
    public static void merge(int[] array, int low, int mid, int high) {

        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;


        for (int i = low; i < high + 1; i++) {

            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {

                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {

                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
    public static void main(String[] args) {

        int[] array = new int[30];
        for (int i=0;i<array.length;i++) array[i]=(int)(Math.random()*100);
        System.out.println("Entered grades");
        for (int i=0;i<array.length;i++) System.out.print(array[i]+" ");
        mergeSort(array, 0, array.length-1);
        System.out.println();
        System.out.println(Arrays.toString(array));

    }
}