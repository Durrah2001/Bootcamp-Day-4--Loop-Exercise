package org.example;
import java.util.Scanner;
public class Ex3 {

    public static void main(String [] args){

          Scanner scanner = new Scanner(System.in);
          StringBuilder builder = new StringBuilder();

//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.
//        If the number is a multiple of 5, you need to print "Buzz" instead of that
//        number.
//        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
//        instead of that number.

          for (int i = 1; i <= 100; i++){

              if(i % 3 == 0 && i % 5 == 0){
                  System.out.println("FizzBuzz");

              }else if(i % 5 == 0){
                  System.out.println("Buzz");

              }else if (i % 3 == 0 ){
                  System.out.println("Fizz");

              }else System.out.println(i);
          }
          System.out.println("-----------------------------");

//
//        2.Write a Java program to reverse a string.

          System.out.println("Enter a string: ");

          String str = scanner.nextLine();
          scanner.nextLine();

          for(int i = str.length() - 1 ; i >= 0; i--){

              String revString = String.valueOf(str.charAt(i));
              System.out.print(revString);


          }

           System.out.println("\n-----------------------------");
//
//        3.Write a program to find the factorial value of any number entered
//        through the keyboard

          System.out.println("Please, enter any number to calculate the factorial value: ");
          int num = scanner.nextInt();
          scanner.nextLine();

          int total = 1;

          for(int i = 1; i <= num; i++){

              total = total *  i;
          }
          System.out.println("The factorial value of " + num + " is : " + total);
//
            System.out.println("-----------------------------");

//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method).

        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secNum = scanner.nextInt();

        int result = 1;
        int i = 1;

        while (i <= secNum){

            if(secNum == 0){
                System.out.println("Try again!, any number of power zero will be 1 !");

            }

            result = result*firstNum;
            i++;
        }
        System.out.println(firstNum + "^" + secNum + "= " + result);


        System.out.println("-----------------------------");

//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.

          int sumEven = 0;
          int sumOdd = 0;
          int number;

              do{
                  System.out.println("Please, enter an integer number: ");
                  number = scanner.nextInt();
                  scanner.nextLine();

           if(number >= 0) {
               if (number % 2 == 0)
                   sumEven += number;  //sum of even numbers

               else sumOdd += number; //sum of odd numbers
           }

             }while (number >= 0);
              System.out.println("Enter an integer number!");

              System.out.println("Sum of even numbers in your numbers set = " + sumEven);
              System.out.println("Sum of odd numbers in your numbers set = " + sumOdd);

              System.out.println("-----------------------------");

//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.

        System.out.println("Please, enter any positive integer number: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();

        if(isPrime(userNumber)){    //Calling the method inside the condition
            System.out.println(userNumber + " Is a prime number!");

        }else System.out.println(userNumber + " Is not a prime number!");


           System.out.println("-----------------------------");



//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.


          for(int w = 1; w <= 4; w++){   //Outer loop, to display the weeks
              System.out.println("Week " + w);

              for(int d = 1; d <= 7; d++){    //Inner loop, to display the days
                  System.out.println("Day" + d);
                  if(d==7){
                      System.out.println("");
                  }
              }

          }

           System.out.println("-----------------------------");

//        8.Write a program that is check if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left.


          System.out.println("Please, enter any word to check if it is a palindrome or not: ");
          String word = scanner.nextLine();
          scanner.nextLine();

          String revWord = new StringBuilder(word).reverse().toString(); //Using .reverse() method to reverse the entered word
          //Using .toString() method to convert the statement from StringBuilder to string

          if(word.equals(revWord)){
              System.out.println( word + " is a palindrome word!");

          }else System.out.println( word + " is not a palindrome word!");

          System.out.println("-----------------------------");


    }

    private static boolean isPrime(int number) {

        if(number <= 1)
            return false;  // Meaning that number is not a prime number, it must be larger than 1

       for(int i = 2; i <= number; i++)
           if(number % i == 0)
            return false;   

        return true;

    }
}
