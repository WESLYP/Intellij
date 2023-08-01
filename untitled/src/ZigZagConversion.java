public class ZigZagConversion {
    public static void main(String[] args) {
        int rows=3;
        String s="PAYPALISHIRING";
        char[] ch=s.toCharArray();
        int index=0;
        StringBuilder sb[]=new StringBuilder[rows];
        for(int i=0;i<rows;i++){
            sb[i]=new StringBuilder();
        }
        while(index<=s.length()-1) {
            for (int i = 0; i < rows && index<=ch.length-1; i++) {
                sb[i].append(ch[index]);
                index++;
            }
            for(int i=rows-2;i>0 && index<=ch.length-1;i--){
                sb[i].append(ch[index]);
                index++;
            }
        }
        StringBuilder result=new StringBuilder(0);
        for(int i=0;i<rows;i++){
            result.append(sb[i]);
        }
        System.out.println(result);

    }
}

/*
P A Y P A L I S H I R I N G

P   A   H   N
A P L S I I G
Y   I   R
 */