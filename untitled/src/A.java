// [3,2,2,3], val = 3

class A {
    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j< nums.length;j++){
        if(nums[j]!=val){
            nums[i]=nums[j];
            i++;
            }
        }
        return i;
    }

    public static void main (String[] args){
        //int[] nums={3,2,2,3};
        int[] nums={0,1,2,2,3,0,4,2};//{0 1 3 0 4 2 2 2}
        int val=2;
        System.out.println(removeElement(nums,val));

    }
}