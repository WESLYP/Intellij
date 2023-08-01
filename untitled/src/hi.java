import java.util.ArrayList;
import java.util.List;

public class hi {
    public static void main(String[] args) {
        int arr1[]={2,0,1,3};
        int arr2[]={0,1,2,3};
        int n=arr1.length;

        int count=0;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(i<j && j<k) {
                        list1.add(arr1[i]);
                        list1.add(arr1[j]);
                        list1.add(arr1[k]);
                        //count++;
                        }
                }
            }
        }

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(i<j && j<k) {
                        list2.add(arr2[i]);
                        list2.add(arr2[j]);
                        list2.add(arr2[k]);
                        //count++;
                    }
                }
            }
        }
        list1.retainAll(list2);
        System.out.println(list1.size()/3);
    }
}
