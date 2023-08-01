import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class practice {
    public static void main(String[] args) {
        System.out.println(compareVersion("1.0.1","1.001"));
    }
    public static int compareVersion(String s1, String s2) {
        int arr[]={2,3,1,5,2};
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
        return 999;
    }
    public static int dot(String s,int j){
        int k=0;
        for(int i=j;i<s.length();i++){
            if(s.charAt(i)=='.')return i;
        }
        return s.length();
    }
}