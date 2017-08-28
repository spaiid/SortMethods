/**
 * Created by tspai on 3/14/2017.
 */
import java.util.Random;
import java.util.Scanner;

public class SortMethod4 {
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
            SortMethod4.selectionSort(data);
        }

        double endTime = System.currentTimeMillis();

        runningTime = (endTime - startTime);

        System.out.println("total running time is: " + runningTime);

    }


    public static void selectionSort(int[] data)
    {

        for (int i = 0; i < data.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = data[index];
            data[index] = data[i];
            data[i] = smallerNumber;
        }
    }
   }
