class Fibonacci{
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 ......... fibonacci series
        int n = fibo(6);
        System.out.println(n);    // we get the nth fibonacci number
    }
    static int fibo(int n){
        //base case - f(0) = 0 , f(1) == 1
        if(n == 0 || n == 1)
        return n;

        int prev = fibo(n - 1);     //faith - subproblem
        int prevprev = fibo(n - 2);  //faith - subproblem

        return prev + prevprev;    // my work

        //reoccurcence relation : f(n) = f(n - 1) + f(n - 2)
    }
}
