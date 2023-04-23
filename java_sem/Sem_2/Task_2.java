package Sem_2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task_2 {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            int[] sortArr = { 25, 11, 0, 30, -1, 8 };
            bubbleSort(sortArr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
            writeLog(Arrays.toString(sortArr));
        }
    }    
    public static void writeLog(String note) {

        try(FileWriter writer = new FileWriter("log.txt"))
        {
           fileWriter.write(note + "\n"); 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    } 
}
