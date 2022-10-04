public class pattern11 {
    public static void main(String[] args) {
        int n=5;
        int sp=0;
        int st=(n);
        for(int i=0;i<2*n-1;i++){
            for(int j=1;j<st;j++){
                System.out.print(" * ");
            }
            for(int j=0;j<sp;j++){
                System.out.print("   ");
            }
            for(int j=n/2;j<st;j++){
                System.out.print(" * ");
            }
            if(i<=n/2){
                st-=1;
                sp+=2;
            }
            else{
                st+=1;
                sp-=2;
            }
            System.out.println("");
        }
    }
}
