public class pattern13 {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(i==0 && j==0 ){
                    System.out.println("0 ");
                }
                if(i==0 && j==1){
                    System.out.println("1 ");
                }
                else{
                    c=a;
                    a=c+b;
                    b=a;
                    System.out.println(a+" ");
                }
            }
        }
    }
}
