package Programing1Project;
import java.util.Random;
import java.util.Scanner;
public class Question4 {
	

	
	    public static void main(String[] args) {
	        Scanner kb = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int row = kb.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int col = kb.nextInt();
	        kb.close();
	        int[][] array = new int[row][col];

	        Random random = new Random();
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                array[i][j] = random.nextInt(100) + 1;
	            }
	        }

	   
	        System.out.println("Original Array:");
	        printArray(array);

	     
	        sortArray(array);

	       
	        System.out.println("Sorted Array:");
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

	   
	    public static void sortArray(int[][] array) {
	        int rows = array.length;
	        int cols = array[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols - 1; j++) {
	                for (int k = 0; k < cols - j - 1; k++) {
	                    if (array[i][k] > array[i][k + 1]) {
	                      
	                        int temp = array[i][k];
	                        array[i][k] = array[i][k + 1];
	                        array[i][k + 1] = temp;
	                    }
	                }
	            }
	        }
	    }
	}
