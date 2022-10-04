package lcmandgcd;
import java.util.*;
public class lcmgcd {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        
        GcdandLcm(a,b);
    }
    
    private static void GcdandLcm(int a,int b){
        int ans=0;
        int A=a;
        int B=b;
        while(a%b !=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        ans=b;
        System.out.println("the gcd is "+ans);
        System.out.println("the lcm is "+(A*B)/ans);
    }
}
