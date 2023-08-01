import java.util.HashMap;

public class Hash_map_printing_single_ele {
    public static void main(String[] args){
        int nums[]={2,2,3,2};
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        for(int key: map.keySet()){
            if(map.get(key)==1){
                System.out.println(key);
            }
        }
    }

}
