package Programing1Project;
import java.util.Scanner;
public class Question2

 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the joker number: ");
        int joker = kb.nextInt();

        System.out.print("Enter the count of numbers: ");
        int count = kb.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = kb.nextInt();
        }

        System.out.println("Output:");

        for (int number : numbers) {
            while (number >= joker) {
                number -= joker;
            }
            System.out.println(number);
        kb.close();
        }
        
    }
}
