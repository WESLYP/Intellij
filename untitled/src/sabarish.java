import java.util.HashMap;
import java.util.Scanner;
//import
class Box {

    double width,height,depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(){
        width=depth=height=0;
    }
    Box(double len){
        width=depth=height=len;
    }
    double volume(){
        return width*height*depth;
    }
}
public class sabarish {
    public static void main(String[] args) {
        Box box1=new Box(10,20,30);
        Box box2=new Box();
        Box box3=new Box(10);

        double vol1=box1.volume();
        System.out.println(vol1);

        double vol2=box2.volume();
        System.out.println(vol2);

        double vol3=box3.volume();
        System.out.println(vol3);

    }
}


