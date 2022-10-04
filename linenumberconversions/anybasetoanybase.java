package linenumberconversions;
import java.util.*;
public class anybasetoanybase {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=decimalvalue(a,b);
            System.out.println("converted value is :"+c);
            System.out.println("decimal to any value :"+decimaltoany(c,s.nextInt()));
        }
    }
    private static int decimalvalue(int a,int b){
        int value=0;
        int temp=0;
        for(int i=0;a>0;i++){
            temp=a%10;
            a=a/10;
            temp=(int)(temp*Math.pow(b,i)+value);
            value=temp;
        }
        return value;
    }
    private static int decimaltoany(int a,int b ){
        int value=0;
        int temp=0;
        for(int i=0;a>0;i++){
            temp=a%b;
            a=a/b;
            temp=(int)(temp*Math.pow(10,i)+value);
            value=temp;
        }
        return value;
    }
}
