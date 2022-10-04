public class pattern2 {
    public static void main(String[] args) {
        int a=5;
        int sp=0;
        int st=a;
        for(int i=0;i<a;i++){            
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=0;j<st;j++){ 
                System.out.print("*"); 
            }
            sp++;
            st--;
            System.out.println("");
            
        }
    }
}
