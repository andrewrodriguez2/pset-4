/**
 * Problem Set 4.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming..
 */

import java.util.Scanner;

public class ProblemSet4 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();
        
        // comment out or uncomment as needed
        
        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();
                
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     * 
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */
    
    public void sum() {
		
	long boundLower;
    long boundUpper;
    long total = 0;
	
	do{
		System.out.print("Lower bound: ");
		boundLower = in.nextLong();
		System.out.print("Upper bound: ");
		boundUpper = in.nextLong();
    }while (boundLower > boundUpper);

      if((boundLower % 2) != 0) {
          boundLower = boundLower + 1;
      }
      for (long i = boundLower; i <= boundUpper; i = i + 2) {
          total += i;
      }
      System.out.printf("\n%,d.", total);
    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */
    
    public void reverse() {
		System.out.println("\n");
		long positiveInteger = 0;
		long digit = 0;

		do {
			System.out.print("Positive integer: ");
			positiveInteger = in.nextLong();
		} while (positiveInteger <= 0);

		System.out.println("");

		while (positiveInteger > 0) {
        if (positiveInteger / 10 < 1) {
			digit = positiveInteger % 10;
			positiveInteger /= 10;
			System.out.print(digit + ".");
        } else {
			digit = positiveInteger % 10;
			positiveInteger /= 10;
			System.out.print(digit + ", ");
        }
      }
		
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */
    
	public void digits() {
      int backToInt = 0;
      int posIntOdd = 0;
      char letterInStringOdd = 'a';
      int sum = 0;
      System.out.print("\n");

      do{
        System.out.print("Positive integer: ");
        posIntOdd = in.nextInt();
      }while(posIntOdd<=0);

      String posIntOddString = Integer.toString(posIntOdd);
      int posIntOddLength = posIntOddString.length();
      for(int i = posIntOddLength - 1; i >= 0; i--){
        letterInStringOdd = posIntOddString.charAt(i);
        backToInt = Character.getNumericValue(letterInStringOdd);
        if(backToInt%2==0){
          sum = sum;
        }else{
          sum = sum + backToInt;
        }
      }
      System.out.println("\n"+sum+".\n");
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */
    
    public void average() {
		
	  long nonNegative = 0;
      long digit = 0;
      double total = 0;
      long numOfValues = 0;
      boolean check = false;
      System.out.print("\n");

    while (check == false) {
        System.out.print("Non-negative integer: ");
        nonNegative = in.nextLong();
        if (nonNegative >= 0) {
        total += nonNegative;
        numOfValues++;
        } else {
        check = true;
        }
      }
      total /= numOfValues;

      System.out.printf("\n%,.2f.", total);
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */
    
    public void prime() {
      long nonNegative = -1;
      boolean isPrime = true;
      System.out.println("\n");

      while (nonNegative < 0) {
        System.out.print("Non-negative integer: ");
        nonNegative = in.nextLong();
      }

      if (nonNegative == 0 || nonNegative == 1) {
        isPrime = false;
      } else {
          for (int i = 2; i < nonNegative; i++) {
            if (nonNegative % i == 0) {
              isPrime = false;
            }
          }
        }

      if (!isPrime) {
        System.out.println("\nNot prime.");
      } else if (isPrime) {
        System.out.println("\nPrime.");
      }


    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */
    
    public void fibonacci() {

    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a positive integer. What are its factors?
     */
    
    public void factors() {
      int positiveInteger = -1;
      int int1 = 0;
      int int2 = 1;
      int int3 = 0;;

      System.out.print("\n");

      while (positiveInteger < 1 || positiveInteger > 92) {
        System.out.print("Positive integer: ");
        positiveInteger = in.nextInt();
      }

      for (int i = 1; i < positiveInteger; i++) {
        int3 = int1 + int2;
        int1 = int2;
        int2 = int3;
      }

      System.out.println("\n" + int3 + ".");

    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */
    
    public void mario() {        
      int height = 0;
      int spaces = 0;
      System.out.print("\n\n");

      do {
        System.out.print("Height: ");
        height = in.nextInt();
      } while (height < 1 || height > 24);

      System.out.print("\n");

      for(int i = 1; i <= height; i++) {
        for (int s = height - i; s > 0; s--) {
          System.out.print(" ");
          spaces++;
        }
        for (int h = height + 1 - spaces; h > 0; h--) {
          System.out.print("#");
        }

        System.out.print("\n");
        spaces = 0;
      }

    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */
    
    public void luigi() {
      int height = 0;
      int spaces = 0;
      int pound = 0;
      System.out.print("\n");

      do {
        System.out.print("Height: ");
        height = in.nextInt();
      } while (height < 1 || height > 24);

      System.out.print("\n");

      for(int i = 1; i <= height; i++) {
        for (int s = height - i; s > 0; s--) {
          System.out.print(" ");
          spaces++;
        }
        for (int h = height + 1 - spaces; h > 0; h--) {
          System.out.print("#");
          pound++;
        }

        System.out.print("  ");

        for (long k = 0; k < pound; k++) {
          System.out.print("#");
        }

        System.out.print("\n");
        spaces = 0;
        pound = 0;
      }

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */
    
    public void credit() {
         System.out.print("\nNumber: ");
         String number = in.nextLine();
         int sumOfEveryOtherDigit = 0;
         int multiplyingDigit;
         int finalSum = 0;

         for (int i = number.length() - 2; i >= 0; i -= 2) {
             multiplyingDigit = Character.getNumericValue(number.charAt(i));
             sumOfEveryOtherDigit = multiplyingDigit * 2;
             if (sumOfEveryOtherDigit >= 10) {
                 finalSum += (int)((sumOfEveryOtherDigit / Math.pow(10, 0)) % 10)
                 + (int)((sumOfEveryOtherDigit / Math.pow(10, 1)) % 10);
             } else {
                 finalSum += sumOfEveryOtherDigit;
             }
         }

         for (int i = number.length() - 1; i >= 0; i -= 2) {
             multiplyingDigit = Character.getNumericValue(number.charAt(i));
             finalSum += multiplyingDigit;
         }

         String stringOfEveryOtherDigit = Integer.toString(finalSum);
         if (stringOfEveryOtherDigit.charAt(stringOfEveryOtherDigit.length() - 1) == '0') {
             if (number.charAt(0) == '3' && (number.charAt(1) == '4' || number.charAt(1) == '7')) {
                 System.out.println("\nAmex.\n");
             } else if (number.charAt(0) == '5' && (number.charAt(1) == '1' || number.charAt(1) ==
             '2' || number.charAt(3) == '3' || number.charAt(4) == '4' || number.charAt(5) == '5')) {
                 System.out.println("\nMastercard.\n");
             } else if (number.charAt(0) == '4') {
                 System.out.println("\nVisa.\n");
             }
         } else {
             System.out.println("\nInvalid.\n");
         }
     }
 }
}