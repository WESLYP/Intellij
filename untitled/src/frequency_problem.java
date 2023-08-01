import java.util.ArrayList;
import java.util.Collections;

public class frequency_problem {

    public static int sub(String s1,String s2){

        int freq1[]=new int[26];
        int freq2[]=new int[26];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            int a=s1.charAt(i)-96;
            freq1[a]++;
        }
        for(int i=0;i<s2.length();i++){
            int b=s2.charAt(i)-96;
            freq2[b]++;


        }
        for(int i=0;i<26;i++){
            if(freq1[i]>=1 && freq2[i]>=1){
               list.add(freq1[i]/freq2[i]);
            }


        }
        return Collections.min(list);
    }

    public static void main(String[] args) {
        //System.out.println(sub("abacbc","bca"));
        System.out.println(sub("mon","monnnn"));
    }
}
