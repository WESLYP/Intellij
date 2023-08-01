import java.util.Scanner;

public class single {

    public static int singlee(int arr[]){
        int c = 0;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            flag=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                  flag=1;
                  //break;
                }

            }
            if(flag==0) {
                c = arr[i];
                return c;
            }

        }
      return c;
    }
    public static void main(String[] args){
        int a[]={1,1,2,2,2,3,2};
        int b=singlee(a);
        //for(int i=0;i<a.length;i++)
            System.out.print(b);
    }

}
//  4   1   2   1   2
