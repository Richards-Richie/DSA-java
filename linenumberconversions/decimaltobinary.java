package linenumberconversions;
import java.util.*;
public class decimaltobinary {
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int a=s.nextInt();
            System.out.println("converted value :"+binary(a,2));
        }

    }
    private static int binary(int a,int b){
        int value=0;
        int temp=0;
        for(int i=0;a>0;i++){
            temp=a%2;
            a=a/2;
            temp=(int)(temp*Math.pow(10,i)+value);
            value=temp;
        }
        return value;
    }
}
