public class pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                for(int j=1;j<=n;j++){
                    if( i==j || j-i==(n/2)|| j-i==-(n/2)){
                        System.out.print(" *");
                    }
                    System.out.print("   ");
                }System.out.println("");
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j-i==(n/2)|| j-i==-(n/2) ){
                        System.out.print(" *");
                    }
                    System.out.print("   ");
                }System.out.println("");
            }
        }
    }
}
