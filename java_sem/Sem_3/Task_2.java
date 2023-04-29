package Sem_3;
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        // заполняем массив
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of array elements: ");
            int n = sc.nextInt();
            int[] newArr = new int[n];
            System.out.println("Enter array elements: ");
            for (int i = 0; i < n; i++){
                newArr[i] = sc.nextInt();           
            }
            System.out.println("Source array: " + Arrays.toString(newArr));
        //сортируем массив
            int[] filterArr = Arrays.stream(newArr).filter(i -> i%2 != 0).toArray();
            System.out.println("Received array: " + Arrays.toString(filterArr));
    } 
}


