package Programing1Project;
import java.util.Random;
import java.util.Scanner;
public class Question3 


 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = kb.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = kb.nextInt();

        int[][] array = new int[row][col];

        
       Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = random.nextInt(100) + 1;
            }
        }

   
        System.out.println("Original Array:");
        printArray(array);

        System.out.print("Enter the number you want to remove: ");
        int numberToRemove = kb.nextInt();
        kb.close();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] == numberToRemove) {
                    array[i][j] = 0;
                }
            }
        }

    
        System.out.println("Updated Array:");
        printArray(array);
    }


    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
       
        }
        
    }
}