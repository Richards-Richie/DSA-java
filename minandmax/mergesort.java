package minandmax;

import java.util.Scanner;

public class mergesort {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int []a=createarray();
        int p=0;
        int r=a.length-1;
        a=mergesortmethod(a,p,r);
        System.out.println("the sorted elements in the array are :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
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
    public static int[] mergesortmethod(int[] a,int p,int r) {
        if(p<r){
            int q=(int)Math.floor((p+r)/2);
            mergesortmethod(a,p,q);
            mergesortmethod(a,q+1,r);
            merge(a,p,q,r);
        }
        return a;
    }
    private static int[] merge(int []a,int p,int q,int r){
        int n1=q-p+1;
        int n2=r-q;
        int max=Integer.MAX_VALUE;
        int []L=new int[n1+1];
        int []R=new int[n2+1];
        for(int i=0;i<n1;i++){
            L[i]=a[p+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=a[q+i+1];
        }
        L[L.length-1]=max;
        R[R.length-1]=max;
        int i=0,j=0;
        int i1=p;
        while(i1<r+1){
            if(L[i]<R[j]){
                a[i1]=L[i];
                i++;
                i1++;
            }
            else{
                a[i1]=R[j];
                j++;
                i1++;
            }
        }
        return a;
    }
}
