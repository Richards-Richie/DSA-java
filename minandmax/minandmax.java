package minandmax;

import java.util.Scanner;

public class minandmax {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] array=createarray();
        final long start=System.currentTimeMillis();
        int [] array1=minandmaxele(array);
        for(int i=0;i<array1.length;i++){
            System.out.println("the minandmaxele are "+array1[i]);
        }
        final long end=System.currentTimeMillis();
        System.out.println("the program executed time is :"+(end-start));
    }
    private static int[] createarray() {
        System.out.println("enter the size of the array :");
        int size=s.nextInt();
        int []a=new int[size];
        System.out.println("enter the elements into the array :");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println("the elements in the array are :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        return a;
    }
    private static int[] minandmaxele(int []array){
        int []b=new int[2];
        int min=array[0],max=array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
            if(max<=array[i]){
                max=array[i];
            }
        }
        b[0]=min;
        b[1]=max;
        return b;
    }
}
