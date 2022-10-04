public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        int sp=1;
        int st=(n/2)+1;
        for(int i=0;i<n;i++){
            for(int j=0;j<st;j++){
                System.out.print("* ");
            }
            for(int j=0;j<sp;j++){
                System.out.print("  ");
            }
            for(int j=0;j<st;j++){
                System.out.print("* ");
            }
            System.out.println("");
                if(i<n/2){
                    
                    st-=1;
                    sp+=2;
                }
                else{
                    
                    st+=1;
                    sp-=2;
                }
            
        }
    }
}
