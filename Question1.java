package Programing1Project;

import java.util.Scanner;

public class Question1 {


	    public static void main(String[] args) {
	        Scanner kb = new Scanner(System.in);

	        System.out.print("Enter the first integer: ");
	        int n1 = kb.nextInt();

	        System.out.print("Enter the second integer: ");
	        int n2 = kb.nextInt();

	        System.out.print("Enter the third integer: ");
	        int n3 = kb.nextInt();
	     
	        int sum = n1 + n2 + n3;
	        int magicNumber;

	        if (sum % 3 == 0 && sum % 5 != 0) {
	            magicNumber = Integer.parseInt(String.valueOf(n2).substring(0, 1)) * 100 + n1 + n3;
	        } else if (sum % 3 != 0 && sum % 5 == 0) {
	            magicNumber = n1 + n3 + Integer.parseInt(String.valueOf(n2).substring(String.valueOf(n2).length() - 1)) * 10;
	        } else if (sum % 3 == 0 && sum % 5 == 0) {
	            magicNumber = n2 * 10000 + n1 * 100 + 1;
	        } else {
	            magicNumber = n1 * 100 + n2 * 10 + n3;
	        }

	        System.out.println("Magic Number: " + magicNumber);
	
	        kb.close();
	    }
	   
	}



