public class pattern16 {
    public static void main(String[] args) {
        int n=4;
        int sp=n+1;
        int st=1;
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<st;j++){
                System.out.print(a+"\t");
                a++;
            }
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            if(i==n-1){
                st--;
                a--;
            }
            
            for(int j=0;j<st;j++){
                a--;
                System.out.print(a+"\t");
            }
            
            st++;
            sp-=2;
            System.out.println();
            System.out.println();
            
        }
    }
}
