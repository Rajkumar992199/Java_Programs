class Rectangle
{
    double width;
    double length;

    double getArea(){
        return (length*width);
    }
    double getPerimeter(){
        return (2*(length+width));
    }
Rectangle(){
width=length=1;
}
Rectangle(double w,double l){
width = w;
length = l;
}
}

class program_2{
public static void main(String[] args)
{
Rectangle ob1 = new Rectangle(4,40);
Rectangle ob2 = new Rectangle(3.5,35.9);
System.out.println("ob1 area = " + ob1.getArea()+" unit^2");
System.out.println("ob1 perimeter = " + ob1.getPerimeter()+" unit");
System.out.println("ob 2 area =" + ob2.getArea()+" unit^2");
System.out.println("ob2 perimeter = " + ob2.getPerimeter()+" unit");
}
}