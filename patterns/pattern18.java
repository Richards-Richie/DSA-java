public class pattern18 {
    public static void main(String[] args) {
        int n=7;
        
        int sp=2;
        int st=3;
        for(int i=0;i<n;i++){
            if(i==0){
                for(int j=0;j<n;j++){
                    System.out.print("*\t");
                }
            }
            else if(i<n/2+1){
                for(int j=0;j<n;j++){
                    if(i==j || n-1-i==j){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");  
                    }
                }
            }
            else{
                for(int j=0;j<sp;j++){
                    System.out.print("\t");
                }
                for(int j=0;j<st;j++){
                    System.out.print("*\t");
                }
                st+=2;
                sp-=1;
            }
            System.out.println();
        }
    }
}
