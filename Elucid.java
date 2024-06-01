import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = fun(x,y);
        System.out.println("GCD IS : "+ans);
        System.out.println("LCM IS :"+ x*y / ans);
        sc.close();
    }
    static int fun(int x , int y){
        if( y == 0) //gcd(x,0) =  x;                                   our base case
        return x;

        return fun(y, x % y);  //Elucid Algorithm : gcd(x,y) => gcd(y,x%y)        Recursive relation

    }
}

// LCM = (x * y) / (gcd(x,y)) 

