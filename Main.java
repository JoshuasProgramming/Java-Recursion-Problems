public class Main{
    public static void main(String[] args){

        Recursion recur = new Recursion();

        //factorial problem
        System.out.println("Factorial Probelm: " + recur.factorial(5));

        //bunnyEars problem
        System.out.println("BunnyEars Problem: " + recur.bunnyEars(5));

        //fibonacci problem
        // System.out.println(recur.fibonacci(21));

        System.out.println("PowerN Problem: " +  recur.powerN(3,2));
    }
}