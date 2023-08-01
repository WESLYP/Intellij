
public class Missing_Number_in_a_String {

    public static void main(String[] args) {
        String str="9899100101103";
        int h=0;
        int curr=0;int a=0;int l=1;
        for(int i=1;i<=6;i++){
            for(int j=0;j+i<=str.length();j=j+i){
                String sub=str.substring(j,j+l);
                //System.out.println(sub);
                a=Integer.parseInt(sub);
                System.out.println(sub);
                if(a==9 ||a==99 ||a==999 ||a==9999 ||a==99999 && a==curr+1){
                   curr=a;h++;
                   l++;
                   
                }else
                if(a==curr+1|| j==0){
                    curr=a;
                }else
                if(a==curr+2 ){
                    System.out.println(curr+1);
                }else
                {curr=a;break;}
			}if(h>0){
                h=0;l--;
            }else
            l++;
            
		}
		
	}
}
                    