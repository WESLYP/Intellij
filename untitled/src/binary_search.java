public class binary_search {
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};

        int target=3;
        int i=0,j=arr.length-1,flag=0;
        if(arr[i]==target){System.out.println(i);flag=1;return;}
        if(arr[j]==target){System.out.println(j);flag=1;return;}
        int mid=(i+j)/2;
        if(flag==0){
        while(arr[mid]!=target) {

            if (target < arr[mid]) {
                j = mid;
            } else {
                i = mid;
            }
            mid = (i + j) / 2;
        }
        }
        System.out.println(mid);
    }
}
