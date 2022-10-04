public class pattern3 {
    public static void main(String[] args) {
        int a=5;
        int sp=a/2;
        int st=1;
        for(int i=0;i<a;i++){
            System.out.println(sp+""+st);
            if(i==a/2){
                sp++;st-=2;
            }
            else{
                sp--;
                st+=2;
            }
        }
    }
}
