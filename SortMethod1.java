/**
 * Created by Justin Spaid on 3/13/2017.
 */

import com.sun.glass.ui.Size;
import sun.security.util.Length;

import java.*;
import java.util.Random;
import java.util.Scanner;

public class SortMethod1 {
    public static void main(String[] args)
    {
        int arraySize;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Please enter size of array.");
        arraySize = scan.nextInt();
        int data[] = new int[arraySize];


    if(arraySize > 0)
    {
        for (int i =0; i < arraySize; i++)
        {
            data[i] = rand.nextInt(10000);
        }


        SortMethod1.printArray(data);
        System.out.println();
        SortMethod1.bubbleSort(data);
        System.out.println();
        SortMethod1.printArray(data);


    }
    }

    public static void printArray(int[] data)
    {


        for ( int i = 0; i< data.length; i++)
            System.out.print(data[i] + " ");

    }


    public static void bubbleSort(int[] data) {

        int n = data.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (data[j - 1] > data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }

            }
        }
    }}






