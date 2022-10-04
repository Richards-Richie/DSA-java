package linenumberconversions;
import java.util.*;
public class anybaseaddition {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=decimalvalue(a,b);
            System.out.println("converted value is :"+c);
            System.out.println("decimal to any value :"+decimaltoany(c,s.nextInt()));
            addition(110,001,2);
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
    private static void addition(int a,int b,int c){
        System.out.println("the given two numbers are :"+a+""+b);
        int temp1=0;
        int temp2=0;
        int temp3=0;
        int temp4=0;
        int value=0;
        for(int i=0;a>0;i++){
            temp3=a%c;
            temp4=b%c;
            a=a/c;
            b=b/c;         
            temp1=(temp3+temp4)%c;
            temp2=(temp3+temp4)/c;
            value=
        }
    }
}

