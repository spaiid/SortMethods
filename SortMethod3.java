/**
 * Created by tspai on 3/14/2017.
 */
import java.util.Random;
import java.util.Scanner;

public class SortMethod3 {
    public static void main(String[] args)
    {
        int arraySize;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double runningTime;

        System.out.println("Please enter size of array.");
        arraySize = scan.nextInt();


        System.out.println("Please enter number of arrays to sort.");
        int num_i = scan.nextInt();

        double startTime = System.currentTimeMillis();

            for (int i = 0; i < num_i; i++)
            {
                int data[] = new int[arraySize];

                for(int j = 0; j < data.length; j++)
                {


                    data[j] = rand.nextInt(10000);


                }
                SortMethod3.bubbleSort(data);
            }

        double endTime = System.currentTimeMillis();

        runningTime = (endTime - startTime);

        System.out.println("total running time is: " + runningTime);




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




