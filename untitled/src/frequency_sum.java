public class frequency_sum {

    public static int common(int X,int Y,int Z){
        int freq1[]=new int[10];
        int freq2[]=new int[10];
        int freq3[]=new int[10];

        for(int i=0;i<3;i++){
            freq1[X%10]++;
            X=X/10;
            freq2[Y%10]++;
            Y=Y/10;
            freq3[Z%10]++;
            Z=Z/10;
        }
        for(int i=0;i<10;i++){
            if(freq1[i]>=1 && freq2[i]>=1 && freq3[i]>=1){
                return i;
            }
        }



        return 10;
    }



    public static void main(String[] args) {
        int n=common(120,560,890);
        System.out.println(n==10?"nothing":n);
    }
}
