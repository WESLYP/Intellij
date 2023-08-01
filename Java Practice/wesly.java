public class wesly{
    public static int thousands(int num){
        int num1=0;
        while(num!=0){
            num1=num%10;
            num=num/10;
            
        }
        return num1;
    }
    public static int hund(int num){
        int num1=0;
        while(num>=10){
            num1=num%10;
            num=num/10;
        }
        return num1;
    }
    public static int in3(int num){
        int num1,max=0;

        while(num!=0){
            num1=num%10;
            num=num/10;
            if(max<num1){
                max=num1;
            }
        }
        
        return max;
    }

    public static int answer(int input1,int input2,int input3){
        System.out.println(thousands(input1));
        
        System.out.println(hund(input2));
        
        System.out.println(in3(input3));

        return 0;



    }































    public static void main(String[] args){
        System.out.println(answer(2968,1234,1958));
        int t=6764;
        System.out.println(hund(t));
         System.out.println(thousands(t));

    }
}