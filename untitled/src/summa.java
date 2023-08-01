import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;

public class summa {

    public static void main(String[] args) {
        int nums[]={-25,25,-27,45,31,46,46,21};
        System.out.println(findMaxK(nums));
    }
    public static int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(set.add(-1*nums[i])==false){
                    max=Math.max(max,nums[i]);
                }

            }else{
                set.add(nums[i]);
            }
        }
        if(max==0)return -1;
        return max;
    }
}
