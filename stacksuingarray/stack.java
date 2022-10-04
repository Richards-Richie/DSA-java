package stacksuingarray;
import java.util.*;
public class stack{
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int a[]=push();
        System.out.println("enter how many values to pop :");
        int b=s.nextInt();
        for(int i=0;i<b;i++){
            System.out.println("returned value is"+pop(a));
        }
    }
    private static int[] push(){
        
        int n=s.nextInt();
        int []b=new int[n];
        int top=-1;
        if(top==-1){
            top=0;
            b[top]=s.nextInt();top++;
        }
        while(top>0 && top<b.length){
            b[top]=s.nextInt();
            top++;
        }
        return b;
    }
    private static int pop(int []a){
        int top=a.length-1;
        if(top>0){
            int value=a[top];
            top--;return value;
        }
        else{
            return -1;
        }
        
    }
    
}