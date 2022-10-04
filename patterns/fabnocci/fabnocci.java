package fabnocci;

public class fabnocci {
    public static void main(String[] args) {
        int n=10;
        int []a=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                a[i]=0;
            }
            else if(i==1){
                a[i]=1;
            }
            else{
                a[i]=a[i-1]+a[i-2];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        fabnocci1(n);
    }
    private static void fabnocci1(int n){
        int c;
        int a=0;int b=1;for(int i=0;i<n;i++){
            c=a+b;
            b=a;
            a=c;
            System.out.print((c)+" ");
        }
    }
}
