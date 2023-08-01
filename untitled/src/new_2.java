import java.util.ArrayList;

public class new_2 {
    public static void main(String[] args) {
        int arr[] = {10, 15, 20, 35, 30};
        ArrayList<Integer> Arr=new ArrayList<>();
        for(int i=0;i< arr.length;i++)Arr.add(arr[i]);

        ArrayList<Integer> Arr1=new ArrayList<>();
        int s=Arr.size();
        int j=0;

        for(;Arr.size()>1;) {
            for (int i = 0; i + 1 < Arr.size(); i = i + 2) {
                j = i + 1;
                int addition = Arr.get(i) + Arr.get(j);
                Arr1.add(addition);
                //System.out.println(Arr1.get(i));
            }
            for (int i = 0; i < Arr1.size(); i++)
                System.out.print(Arr1.get(i) + " ");
            System.out.println(arr[arr.length - 1]);

            Arr = (ArrayList) Arr1.clone();
            Arr1.clear();
            //System.out.println(Arr);
        }

    }
}