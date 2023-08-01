class Minimum_ways_recursion {
    static int g=0;
    public static int solve(int arr[][],int sr,int sc,int er,int ec,int count){
        //System.out.println(g++);
        if(sr==er && sc==ec)return count;
        if(sr>3 ||sc>4 ||sr<0|| sc<0|| arr[sr][sc]>0 )return 9999;


        arr[sr][sc]=5;
       int a= solve(arr,sr,sc+1,er,ec,count);//5
       int b= solve(arr,sr,sc-1,er,ec,count+1);//7
       int c= solve(arr,sr+1,sc,er,ec,count);//9999
       int d= solve(arr,sr-1,sc,er,ec,count+1);//2
       arr[sr][sc]=0;
       return Math.min(Math.min(Math.min(a,b),c),d);
    }
    public static void main(String[] args) {
        /*
        0-ways
        1-obstacle
        To find shortest path
         */

        int arr[][]={
                {0,0,0,0,0},
                {0,0,0,1,0},
                {0,0,1,0,1},
                {0,0,0,1,0}
        };
        int ans=solve(arr,2,3,0,4,0);
        if(ans==9999)ans=-1;
        System.out.println(ans);
    }
}