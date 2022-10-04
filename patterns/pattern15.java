public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        int sp=n/2;
        int st=1;
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("   ");
            }
            for(int j=0;j<st;j++){
                System.out.print(" "+a+" ");
                if(j<n/2){
                    a=a+1;
                }
                else{
                    a--;
                }
            }
            if(i<(n/2)){
                sp-=1;
                st+=2;
            }
            else{
                sp+=1;
                st-=2;
            }
            
            System.out.println();
        }
    }
}
