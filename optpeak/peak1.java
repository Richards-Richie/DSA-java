package optpeak;
import java.util.Scanner;

public class peak1 {
    private static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        final long startTime = System.currentTimeMillis();
        System.out.println("enter the size of the array :");
        int size=s.nextInt();
        int []array=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("enter the element");
            array[i]=s.nextInt();
        }
        Ppeak(array,size);
        final long endTime = System.currentTimeMillis();
        System.out.println("total executed time :"+(startTime-endTime));
    }
    private static void Ppeak(int []array,int size){
        int i=0;
        while(i<size){
            
            if(i==0){
                if(array[i]>array[i+1]){
                    System.out.println("the peak of the array is :"+array[i]);
                    i+=1;
                }
            }
            else if(i!=0 && i!=size-1){
                if(array[i]>array[i+1] && array[i]>array[i-1]){
                    System.out.println("the peak of the array is :"+array[i]);
                    i+=1;
                    
                }
            }
            else{
                if(array[i]>array[i-1]){
                    System.out.println("the peak of the array is :"+array[i]);
                }
            }
            i+=1;
        }
    }
}
