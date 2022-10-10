public class Recursion {
    
    
    public int factorial(int n) {

        //base case
        if(n == 0) return 1;
        
        //recursion case
        return n * factorial(n - 1);
    }

}
