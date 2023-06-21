package Programing1Project;

public class Question6  {
	 public static void main(String[] args) {
	        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1}; 
	        int n = nums.length;
	        int totalSum = (n * (n + 1)) / 2;
	        int arraySum = 0;

	        for (int num : nums) {
	            arraySum += num;
	        }

	        int missingNumber = totalSum - arraySum;
	        System.out.println("The missing number is: " + missingNumber);
	    }
	}
