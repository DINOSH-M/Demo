// code to print the following pattern

    // *
    // * *
    // * * *
    // * *
    // *
import java.util.*;

class Patterns{
    public static void main(String[] s){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        patternA(n);
    }

    public static void patternA(int n){
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n;j++){
                if( (i>=n && i+j <=(n*2)-2) || (i+j<=i*2 && i<n) )
                 System.out.print("*")  ;
                else
             System.out.print(" ")  ;
            }
            System.out.println();
        }
        
        
    }
}
