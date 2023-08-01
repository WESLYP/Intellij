import java.util.*;
public class new_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        int x=1;
        boolean flag=false;
        StringBuilder build=new StringBuilder(s);
        for(int i=0;i<n;i++){
            if(build.length()%2==0){
                int mid= build.length()/2;
                build.insert(mid,"#"+x+++"#");

            }else{
                if(flag){
                    build.insert(0,"*");
                    flag=false;
                }else{//right
                    build.append("*");
                    flag=true;
                }
                int mid= build.length()/2;
                build.insert(mid,"#"+x+++"#");

            }
        }
        System.out.print(build.toString());

    }
}
