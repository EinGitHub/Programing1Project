package Programing1Project;

public class Question5 {
   
	
	public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = nums[0];
        int count = 1; 
        
        
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
             
                majority = nums[i];
                count = 1;
            } else if (nums[i] == majority) {
              
                count++;
            } else {
              
                count--;
            }
        }

        System.out.println("The majority element is: " + majority);
    }
}
