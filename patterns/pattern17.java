public class pattern17 {
    public static void main(String[] args) {
        int n=7;
        int st=1;
        for(int i=0;i<n;i++){
            if(i!=n/2){
                for(int j=0;j<(n/2);j++){
                    System.out.print("\t");
                }
                if(i==n/2+1){
                    st--;
                }
                for(int j=0;j<st;j++){
                    System.out.print("*\t");
                }
                if(i<n/2){
                    st++;
                }
                else{
                    st--;
                }
            }
            else{
                for(int j=0;j<n;j++){
                    System.out.print("*\t");
                }
            }
            System.out.println("\n");
        }
    }
}
