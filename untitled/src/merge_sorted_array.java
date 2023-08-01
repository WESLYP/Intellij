public class merge_sorted_array {


        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

            int a,b,c;
            a=m-1;
            b=m+n-1;
            c=n-1;

            while(c>=0 && a>0){
                if(nums2[c]>nums1[a]){
                    nums1[b]=nums2[c];
                    c--;
                    b--;
                }else{
                    a--;
                    if(nums1[a]==nums2[c]){
                        nums1[b]=nums1[a+1];
                        nums1[a+1]=nums2[c];
                    }
                }

            }
            return  nums1;

        }
        public static void main(String[] args){
            int nums1[]={1,2,3,0,0,0};
            int nums2[]={2,5,6};
            int m=3;
            int n=3;
            int hi[]=merge(nums1,m,nums2,n);
            for(int i=0;i<nums1.length;i++){
                System.out.print(nums1[i]+" ");
            }
            }



//      {1,2, 3 0  0  0} {2,  5,  6}
    //     a    b         c
}
