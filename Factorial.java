public class Factorial {
    public static void main(String[] args) {
        // factorial : N = n * (n - 1) * (n - 2) * ..... * 1
        int f = fact(5);
        System.out.println(f);
    }
    static int fact(int n){
        //base case : fact(1) = 1 easy
        if(n == 1)
        return 1;

        int prev = fact(n - 1);  // faith - sub problem

        int ans = n * prev; // my work

        return ans;

        //reoccurence relation : f(n) = n * f(n - 1)
    }
}
