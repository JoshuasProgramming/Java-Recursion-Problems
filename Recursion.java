// import java.util.Arrays;

public class Recursion {

    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
     * factorial(1) → 1
     * factorial(2) → 2
     * factorial(3) → 6
     * @param n  
     * @return the sum of the multiplication of n times n - 1 until n equals 0
     */ 

    public int factorial(int n) {

        //base case
        if(n == 0) return 1;
        
        //recursion case
        return n * factorial(n - 1);
    }


    public int bunnyEars(int bunnies) { 

        //base case
        if(bunnies == 0) return 0;

        //recursion case
        //keep on adding 2 until bunnies equals to zero.
        //When it does we'll add the sum to 0
        return bunnyEars(bunnies - 1) + 2;

    }

    public int fibonacci(int n) {
        
        //base case 1
        if(n < 2) return 1;

        //recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public int powerN(int base, int n) {

        //base case
        if(n == 1) return base;

        //recursive case
        return powerN(base, n-1) * base;
    }

    public int triangle(int rows) {
        
        //base case
        if(rows <= 0) return 0;

        //recursive case
        return triangle(rows - 1) + rows;
  
    }

    public int sumOfDigits(int n){

        //base case
        if(String.valueOf(n).length() == 1){
            return n;
        }

        //recursive case []
        return (sumOfDigits(n/10)) + n % 10;
    }

    public int binaryNumOfN(int n){

        //base case
        if(n == 0){
            return -1;
        }

        //recursive case
        return binaryNumOfN(n) + n*n;
        


        //4 => 16
    }

    public int threeXPlus1(int x){

        //when x is 1 we won't print out x
        if(x > 1){
            System.out.println(x);
        }

        //base case
        if(x == 1){
            return x;
        }

        //if x is even
        if(x % 2 == 0){
            x = (x/2);
            return (threeXPlus1(x));
        }


        //if x is odd
        if(x % 2 == 1){
            x = ((3 * x) + 1);
            return (threeXPlus1(x));
        }

        return 1; 

    }

    // public int sumOfPartsOfArray(int[] n){

    // }
}


