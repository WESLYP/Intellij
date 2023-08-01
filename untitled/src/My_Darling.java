public class My_Darling {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 0, 0, 0, 1, 0, 0, 1};
        canPlaceFlowers(arr, 2);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length, ans = 0, count = 0, s = 0;

        if(flowerbed[0]==0 && flowerbed[1]==0){
            ans+=1;
            flowerbed[0]=1;
        }

        for (int left = 0, right = 1; right < len; right++) {

            if (flowerbed[right] == 1) {
                ans= right - left - 1;
                left = right;

            }
        }
        System.out.println(ans);
        return true;
    }
}
