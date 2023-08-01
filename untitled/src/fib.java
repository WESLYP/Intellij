import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class fib {
    public static void main(String[] args) {
        String s="111112113115";
        for(int i=1;i<4;i++){
            for(int j=0;j+i+i-1<s.length();){
                String current=s.substring(j,j+i);
                String next=s.substring(j+i,j+i+i);
                int curr=Integer.parseInt(current);
                int nex=Integer.parseInt(next);
                if(curr+1!=nex && nex!=curr+2) {
                    j+=i;
                  break;
                }
                if(curr+1!=nex && nex==curr+2) {
                    System.out.println(nex - 1);
                }
                //System.out.println(current+" "+next);
                j+=i;
            }
        }




    }
}

