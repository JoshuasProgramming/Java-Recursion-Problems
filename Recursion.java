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

}
