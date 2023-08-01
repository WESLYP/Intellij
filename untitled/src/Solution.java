import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.HashMap;
class Solution {

    public static int ways(int n) {
        if(n<2)
return n;
        return ways(n-1)+ways(n-2);
    }
    public static void main(String[] args) throws ParseException {


        System.out.println(ways(3)+1);
        }

        // 0 1 1 2 3 5
       // System.out.println(pro);
        /*
        //String s="abacadefghibj";//14
        //String s="abcghdiefjoba";//15
        String s="abacadefghibjz";//17

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char first = s.charAt(i);
            if (first>='j' && first<='r')
                map.put(first, map.getOrDefault(first, 0) + 2);
            else if(first>='s')
                map.put(first, map.getOrDefault(first, 0) + 3);
            else
                map.put(first,map.getOrDefault(first,0)+1);

        }
        System.out.println(map);
        int result=0;
        for(char i:map.keySet()){
            result+=map.get(i);
        }
        System.out.println(result);

         */

         /*
        int count=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='i'){
                count++;
            } else if (ch>='j' && ch<='r') {
                count=count+2;
            } else{
                count=count+3;
            }
        }
        System.out.println(count);

*/
    }



        /*

        // Printing the rounded number
        System.out.println(number);
        /*
        String startTime="10:00";
        DateFormat sdf=new SimpleDateFormat("hh:mm");
        Date date=new Date();
        date=new Date("11/11/2000");
        System.out.println(date);



         */



       /* int a = 0;
        int sum = 0;
        int b = 0;
        int j = 0;
        int arr[] = {4, 7, 15, 11, 10, 5, 2};
        int ft = arr[0] + arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (j < arr.length-1)
                j = i + 1;
            if (arr[i] < arr[j] && i == 1 && j == 2) {
                a = a + arr[j];
                //j++;

            }
            else if (arr[i] >=arr[j]) {
                b = b + arr[i];
            }
        }

        System.out.println(ft + a);
        System.out.println(b);
        System.out.println((ft+a)*b);
    }
}

    int productOfSums(int SIZE, int *arr))
    {
        int first=arr[0];
        int sum1=first;
        int sum2;
        int i;
        for( i=1;i<SIZE;i++){
            if(arr[i]>arr[i-1]){
                sum1+=arr[i];
            }else{
                break;
            }
        }sum2=arr[i-1];
        for(;i<SIZE;i++){
            sum2+=arr[i];
        }
        return sum1*sum2;

    }

 */