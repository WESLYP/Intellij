public class Matrix_Multiplication {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int arr2[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int arr3[][]=new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum=0;
                for(int k=0;k<3;k++){
                    sum+=(arr1[i][k]*arr2[k][j]);
                }
                arr3[i][j]=sum;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
