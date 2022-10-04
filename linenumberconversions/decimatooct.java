package linenumberconversions;
import java.util.*;

public class decimatooct {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a=s.nextInt();
            int oct=octal(a,8);
            System.out.println("converted number :"+oct);
        }
    }
    private static int octal(int a,int b){
        int value=0;
        for(int i=0;a>0;i++){
            int temp=a%8;
            a=a/8;
            temp=(int)(temp*(Math.pow(10,i))+value);
            value=temp;
        }
        return value;
    }
}
