public class Main{
    public static void main(String[] args){

        Recursion recur = new Recursion();

        //factorial problem
        System.out.println("Factorial Problem: " + recur.factorial(5));

        // //bunnyEars problem
        // System.out.println("BunnyEars Problem: " + recur.bunnyEars(5));

        //fibonacci problem
        // 0 1 1 2 3 5 8 13 21 34 55
        System.out.println(recur.fibonacci(7));

        //PowerN problem (exponentiation)
        System.out.println("PowerN Problem: " + recur.powerN(3,2));

        //sum of digits
        System.out.println("Sum of digits: " + recur.sumOfDigits(999));

        // //Triangle problem
        // System.out.println("Triangle Problem: " + recur.triangle(5));
    }
}