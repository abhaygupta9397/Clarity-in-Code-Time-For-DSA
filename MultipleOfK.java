// Print first K mutiple of number n
public class MULK {
        public static void main(String[] args) {
        int n = 2;
        int k = 10;
        mul(n , k);
    }
    static void mul(int n , int k){
        //base case
        if(k == 1){
            System.out.println(n);
            return ;
        }
        
        mul(n , k - 1);  // faith ye K - 1 multiple print kardega

        System.out.println(n * k);  // Just do the self work and print (n * k)
        
     
        
    }
}


