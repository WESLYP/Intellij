import java.util.HashMap;

class N{

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        char[] arr = s.toCharArray();

        //System.out.println(arr.length);
        for (int i = 0; i <s.length(); i++) {
            int fp = i;
            int sp = i + 1;
            if (sp<arr.length) {
                if (map.get(arr[fp]) >= map.get(arr[sp])) {
                    result = result + map.get(arr[fp]);
                } else {
                    result = result + (map.get(arr[sp]) - map.get(arr[fp]));
                    i++;
                }


        }else{
            result =result+map.get(arr[fp]);
        }

    }
        return result;
    }

    public static void main (String[] args){

        System.out.println(romanToInt("IXV"));

    }
}
//IVX