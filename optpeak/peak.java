package optpeak;
import java.util.Scanner;

public class peak {
    private static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        final long startTime = System.currentTimeMillis();
        System.out.println("enter the size of the array :");
        int size=s.nextInt();
        int []array=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("enter the element");
            array[i]=s.nextInt();
            s.nextLine();
        }
        Ppeak(array,size);
        final long endTime = System.currentTimeMillis();
        System.out.println("total executed time :"+(startTime-endTime));
    }
    private static void Ppeak(int []array,int size){
        for(int i=0;i<size;i++){
            
            if(i==0){
                if(array[i]>array[i+1]){
                    
                    System.out.println("the peak value is :"+array[i]);
                }
            }
            else if(i>0 && i<size-1){
                
                if(array[i]>array[i-1] && array[i]>array[i+1]){
                    System.out.println("the peak value is :"+array[i]);
                }
            }
            else{
                
                if(array[i]>array[i-1]){
                    System.out.println("the peak value is :"+array[i]);
                }
                break;
            }
        }
    }
}
