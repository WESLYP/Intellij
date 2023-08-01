public class B {
    public static int[] hi(int[] arr) {
        int last = arr.length - 1;

        if (arr[last] < 9) {
            arr[last]++;
        }
        return arr;

    }

    public static void main(String[] args) {
        /*int ln[]={1,2,3};
        //System.out.println(hi(ln));
        int a[]=hi(ln);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            */

        int[] a = {1, 2, 3, 4};
        int[] b = hi(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
