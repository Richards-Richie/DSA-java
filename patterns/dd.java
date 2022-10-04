public class dd {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = new int[n];
        int b[] = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = i+1;
        }
        for(int i : arr)
            System.out.print(i+" ");
        
        int i = 0 ;
        int j = n-1;
        //int k = n-1;

        for( int k = n-1; k>=0 ; k--){
            b[j] = arr[k];
            k--;
            j--;
            b[i] = arr[k];
            k--;
            i++;
        }

        System.out.println();

        for(int m = 0 ; m < n ; m++){
            System.out.print(b[m]+" ");
        }
    }
}
