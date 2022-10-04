public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        int sp=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("   ");
            }
            System.out.println("* ");                                                                                                                              
            sp--;
        }
        pattern81();
    }
    private static void pattern81(){
        int n=5;
        for(int i=0;i<n;i++){ 
            for(int j=0;j<n;j++){
                if(n-i-1==j){
                    System.out.print(" * ");
                }
                System.out.print("   ");
            }
            System.out.println("");
        }
    }
    
}
