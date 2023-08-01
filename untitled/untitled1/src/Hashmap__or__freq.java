import java.util.Collections;
import java.util.HashMap;

public class Hashmap__or__freq {

    public static void main(String[] args) {
        String s="aabbcde";
        HashMap<Character,Integer> map=new HashMap<>();
        int a=0;
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(map.containsKey(ch)){
                a=map.get(ch);
                a++;
                map.replace(ch,a);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        System.out.println(Collections.max(map.values()));

    }
}
