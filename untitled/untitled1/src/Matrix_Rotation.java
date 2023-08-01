public class Matrix_Rotation {

    public static int[][] matrixRotation(int arr[][]){

        int arr1[][]=new int[arr.length][arr[0].length];

        for(int i=0,k=0;i<arr.length;i++,k++){

            for(int j=arr[0].length-1,l=0;j>=0;j--){

                arr1[k][l++]=arr[j][i];

            }

        }
      return arr1;
    }

    public static void print(int arrr[][]){
        int k=0;
        for(int i=0;i< arrr.length;i++){

            for(int j=0;j<arrr[0].length;j++){
                System.out.print(arrr[i][j]+" ");
                //arr1[k][l]=arr[j][i];
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                    };
      int rotated[][]=  matrixRotation(arr);
      int rot[][]=matrixRotation(rotated);
        print(rot);



        }
    }

