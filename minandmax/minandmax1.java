package minandmax;

import java.util.*;
public class minandmax1{
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int []a=createarray();
        int p=0;
        int r=a.length-1;
        final long start=System.currentTimeMillis();
        a=mergesort.mergesortmethod(a,p,r);
        System.out.println("the sorted array is :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("the min and max elements are :");
        int []b=minandmax(a);
        for(int i=0;i<b.length;i++){
            System.out.println("the extreme elements are :"+b[i]);
        }
        final long end=System.currentTimeMillis();
        System.out.println("the program executed time is :"+(end-start));

    }
    private static int[] minandmax(int[] a) {
        int []b=new int[2];
        b[0]=a[0];
        b[1]=a[a.length-1];
        return b;
    }
    private static int[] createarray() {
        System.out.println("enter the size of the array :");
        int size=s.nextInt();
        int []array=new int[size];
        System.out.println("enter elements into the array :");
        for(int i=0; i<size; i++){
            System.out.println("enter element :");
            array[i]=s.nextInt();
        }
        return array;
    }    
}