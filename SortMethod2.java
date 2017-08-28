/**
 * Created by tspai on 3/14/2017.
 */
import java.util.Date;
        import java.util.Random;
        import java.util.Scanner;

public class SortMethod2 {
    public static void main(String[] args) {
        int arraySize;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Please enter the size of the array.");
        arraySize = scan.nextInt();
        int data[] = new int[arraySize];






        if (arraySize > 0) {
            for (int i = 0; i < arraySize; i++) {
                data[i] = rand.nextInt(10000);
            }


            SortMethod2.printArray(data);
            System.out.println();
            selectionSort(data);
            System.out.println();
            SortMethod2.printArray(data);


        }
    }

    public static void printArray(int[] data) {


        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");

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
