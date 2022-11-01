public class Main{
    public static void main(String[] args){

        Recursion recur = new Recursion();

        //factorial problem
        System.out.println("Factorial Problem: " + recur.factorial(5));

        // //bunnyEars problem
        // System.out.println("BunnyEars Problem: " + recur.bunnyEars(5));

        //fibonacci problem
        System.out.println(recur.fibonacci(21));

        //PowerN problem (exponentiation)
        System.out.println("PowerN Problem: " + recur.powerN(3,2));

        //sum of digits
        System.out.println("Sum of digits: " + recur.sumOfDigits(999));

        // //Triangle problem
        // System.out.println("Triangle Problem: " + recur.triangle(5));
    }
}