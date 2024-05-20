// Recursion - means full faith (sampoorn vishwash)

//  THE Recursion Spell
//  1) Identify the smaller problem  : Use Recursion to solve it (Have faith, it works!)
//  2) Self Work : Do your task
//  3) Identify the base case : smallest problem for which the result is obvious

public class Recursion {
    public static void main(String[] args) {
        int N = 10;

        //Task - 1 : Print Numbers from 1 to N like - 1,2,3,4,....N
        System.out.println("Start printing from 1 to N : ");
        oneToN(N);
        System.out.println("Printing from 1 to N completed ");
        //Task - 2 : Print Numbers from N to 1 like - N,N-1,.......1
        System.out.println("Start printing from N to 1 : ");
        nToOne(N);
        System.out.println("Printing from N to 1 completed ");
    }
    static void oneToN(int N){
        if(N == 0)           // The Base Case - just up to 1
        {
            return;
        }

        oneToN(N - 1);           // agar mujhe 1,2,3...N-1 tak uttar mil gaye tho mai  (smaller problem - use recursion (It works)) 
        System.out.println(N);    // N laga duga kam complete hogaye ga.  "well it does" (My Work is done. Yeah!)
    }
    
    static void nToOne(int N){
        if(N == 0)        // The Base Case - just up to 1
        {
            return;
        }

        System.out.println(N); // my work
        nToOne(N - 1);         // smaller work (full faith)
    }

    
}


// Note - Recursive functions are stored as stack frame in call stack
