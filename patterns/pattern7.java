public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        int sp=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("  ");
            }
            System.out.println("* ");
            sp++;
        }
    }
    
}
