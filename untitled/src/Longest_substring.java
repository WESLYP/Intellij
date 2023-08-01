import java.util.HashSet;

public class Longest_substring {

    public static void main(String[] args) {

        String s = "abcabcbb";
        //if(s.length()==0)return 0;
        //if(s.length()<=1)return 1;
        int val = 0, max = 0;
        //ArrayList<Integer> list=new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (set.add(s.charAt(j)) == false) {
                    val = Math.abs(i - j);
                    //list.add(max);
                    max = Math.max(val, max);
                    set.clear();
                    break;
                }
            }
                if(set.size()==s.length()){
                    max=s.length();
                    break;

            }
        }

        System.out.println(max);

    }

        }


