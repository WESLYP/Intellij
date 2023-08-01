public class summa {
    public static int[] number(int num1, int num2, int num3) {
        int n;
        int countEven = 0;
        int countOdd = 0;
        
        while (num1 != 0) {
            n = num1 % 10;
            if (n % 2 == 0)
                countEven = countEven + n;
            else
                countOdd = countOdd + n;
            num1 = num1 / 10;
        }
        
    

    while (num2 != 0) {
        n = num2 % 10;
        if (n % 2 == 0)
            countEven = countEven + n;
        else
            countOdd = countOdd + n;
        num2 = num2 / 10;
    }
    

    while (num3 != 0) {
        n = num3 % 10;
        if (n % 2 == 0)
            countEven = countEven + n;
        else
            countOdd = countOdd + n;
        num3 = num3 / 10;
    }
    
    return new int[]{countEven,countOdd};
    }

    

    public static void main(String[] args) {
        // number(1234);
        //System.out.println(number(1234, 4321, 7896));
        int[] a=number(1234, 4321, 7845);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
