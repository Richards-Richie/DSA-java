package digitfrequency;

import java.util.Scanner;

public class digitfrequency {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=digits(a,b);
            System.out.println("digits :"+c);
        }
    }
    private static int digits(int a,int b){
        int temp=a;
        int count=0;
        while(a>0){
            temp=a%10;
            a=a/10;
            if(temp==b){
                count++;
            }
        }
        return count;
    }
}
