package com.numProgram;

public class AddDigits {
	public int addDigits(int num) {
        while (num >= 10) {
            int digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            num = digitSum;
        }
        return num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution solution = new Solution();
		AddDigits solution=new AddDigits();

        int num1 = 38;
        int result1 = solution.addDigits(num1);
        System.out.println("Input: " + num1);
        System.out.println("Output: " + result1);

       /* int num2 = 0;
        int result2 = solution.addDigits(num2);
        System.out.println("Input: " + num2);
        System.out.println("Output: " + result2);*/

	}

}
