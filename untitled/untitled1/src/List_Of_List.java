import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LEETCODE 1200
public class List_Of_List {
    public static void main(String[] args) {
        int n[]={4,2,1,3};
        minimumAbsDifference(n);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        Arrays.sort(arr);
        int i=0,j=1,min=Integer.MAX_VALUE;
        while(j<arr.length){
            int a=Math.abs(arr[i]-arr[j]);
            min=Math.min(min,a);
            i++;j++;
        }
        int k=0,l=1;
        while(l<arr.length){
            if(Math.abs(arr[k]-arr[l])==min){
                ans=new ArrayList<>();
                ans.add(arr[k]);
                ans.add(arr[l]);
                list.add(ans);

            }
            k++;l++;
        }
        //System.out.println(min);
        System.out.println(list);


        return list;
    }

}
