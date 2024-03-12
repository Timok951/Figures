public class Figure {
    public static int height;
    public static int width;
    public Figure(int height, int width){
        this.height = height;
        this.width = width;
    }

    public static int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }

      static void SquareP(){
        int P = 2*(height + width);
        System.out.println(P);
    }
}

class Square extends Figure{
    public Square(int height, int width) {
        super(height, width);
    }
    static void SquareP(){
        System.out.println(height*width);
    }

    static void SquareS(){
        System.out.println(height*width);
    }
}

class Triangle extends Figure{
    public static int side1;
    public static int side2;
    public static int side3;
    public Triangle(int heigh, int side1, int side2, int side3){
        super(height,width);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    static void TriangleP(){
        System.out.println(side1+side2+side3);
    }

    static void TriangleS(){
        System.out.println(height/2*side1);
    }
}

class Circle extends Figure{
    public static int radius;

    public Circle(int radius){
        super(height,width);
        this.radius = radius;
    }

    static void CircleP(){
        System.out.println(3.14*radius*2);

    }

    static void CircleS(){
        System.out.println(3.14*radius);
    }
}

class Pentagon extends Figure{
    public static int side;
    public static int apohem;


    public Pentagon(int apohem, int side){
        super(height,width);
        this.side = side;
        this.apohem=apohem;
    }

    static void PentagonP(){
        System.out.println(side*5);

    }

    static void PentagonS(){
        System.out.println(apohem*5);
    }
}

class Trapezoid extends Figure{

    public static int upperside;
    public static int side1;
    public static int side2;




    public Trapezoid(int upperside, int side1, int side2, int width, int height){
        super(height,width);
        this.upperside = upperside;
        this.side1 = side1;
        this.side2 = side2;
    }

    static void TrapezoidP(){
        System.out.println(width+side1+side2+upperside);

    }

    static void TrapezoidS(){
        System.out.println((width+upperside)/2*height);
    }
}

class Rectangle extends Figure{

    public Rectangle(int height, int width){
        super(height,width);

    }

    static void RectangleP(){
        System.out.println(height*2+width*2);

    }

    static void RectangleS(){
        System.out.println(height*width);
    }
}

class Parallelogram extends Figure{

    public static int side;
    public static int side2;

    public Parallelogram(int side, int side2, int height){
        super(height,width);
        this.side = side;
        this.side2 = side2;

    }

    static void ParallelogramP(){
        System.out.println(2*(side*side2));

    }

    static void ParallelogramS(){
        System.out.println(side*height);
    }
}

class Paralelipiped extends Figure{

    public static int side;
    public static int side2;

    public static int side3;

    public  static int Pflat;

    public Paralelipiped(int side, int side2,int side3, int Pflat, int height){
        super(height,width);
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
        this.Pflat = Pflat;

    }

    static void ParalelipipedP(){
        System.out.println(4*(side*side2*side3));

    }

    static void ParalelipipedS(){
        System.out.println(Pflat*height);
    }
}

class Cilinder extends Figure{

    public static int radius;
    public static int Sbase;
    public static int Sside;

    public Cilinder(int radius, int Sbase, int Sside){
        super(height,width);
        this.radius = radius;
        this.Sbase = Sbase;
        this.Sside = Sside;


    }

    static void CilinderP(){
        System.out.println((3.14*radius)*(3.14*radius));

    }

    static void CilinderS(){
        System.out.println(2*Sbase+Sside);
    }
}

class Sphere extends Figure{
    public static int radius;

    public Sphere(int radius){
        super(height,width);
        this.radius = radius;
    }

    static void SphereP(){
        System.out.println(3.14*radius*2);

    }

    static void SphereS(){
        System.out.println(4*(3.14*(radius*radius)));
    }
}

class Romb extends Figure{
    public static int side1;


    public Romb(int side1, int height){
        super(height,width);
        this.side1 = side1;
    }

    static void RombP(){
        System.out.println(side1*4);

    }

    static void RombS(){
        System.out.println(side1*height);
    }
}


class Conus extends Figure{
    public static int radius;
    public static int hypotenyse;


    public Conus(int radius, int hypotenyse){
        super(height,width);
        this.radius = radius;
        this.hypotenyse = hypotenyse;
    }


    static void ConusS(){
        System.out.println(3.14*radius*hypotenyse+3.14*radius*2);
    }
}