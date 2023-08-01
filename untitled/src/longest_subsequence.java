import java.util.Arrays;

public class longest_subsequence {
    public static void main(String[] args) {
//        String s1="abaaba";
//        String s2="babbab";


        String s1="bl";
        String s2="yby";


//        int num1[] = {4,0,1,3,2};
//        int num2[] = {4,1,0,2,3};
//        String s1="",s2="";
//        for(int i=0,j=0;i<num1.length && j<num2.length;i++,j++) {
//            s1 = s1 + String.valueOf(num1[i]);
//            s2 += String.valueOf(num2[j]);
//        }

            int arr[][]=new int[s1.length()+1][s2.length()+1];
            //try{


        for(int i=0;i<s1.length()+1;i++){
            for(int j=0;j<s2.length()+1;j++){
                if(i==0||j==0)
                    arr[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    arr[i][j]=1+arr[i-1][j-1];
                else
                    arr[i][j]=Math.max(arr[i][j-1],arr[j][i-1]);
            }
        }
            //}catch(Exception e){System.out.print(Math.min(s1.length(),s2.length()));}
//        for(int i=0;i<s1.length()+1;i++) {
//            for (int j = 0; j < s2.length()+1; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//
//        }



        System.out.println(arr[s1.length()][s2.length()]);
    //}catch(Exception e){System.out.print(Math.min(s1.length(),s2.length()));}
                }
    }


