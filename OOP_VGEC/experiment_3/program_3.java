class Cartesian_Point{
    int x,y;

    int X(){
        return x;
    }
    int Y(){
        return y;
    }
    void move(){
        x = x+y;
        y = x-y;
        x = x-y;
    }
    void display(){
        System.out.println("X = "+ x);
        System.out.println("Y = "+ y);
    }
    void move(int t){
        x=y=t;
    }
    Cartesian_Point(int a, int b){
        x=a;
        y=b;
    }
    Cartesian_Point(int a){
        x=a;
        y=a;
    }
}
public class program_3 {
    public static void main(String arg[]){
        Cartesian_Point ob1 = new Cartesian_Point(4);
        Cartesian_Point ob2 = new Cartesian_Point(2,3);
        System.out.println("X = " + ob1.X());
        System.out.println("Y = " + ob1.Y());
        ob1.move(5);
        ob1.display();
        System.out.println("X = " + ob2.X());
        System.out.println("Y = " + ob2.Y());
        ob2.move();
        ob2.display();
    }
}
