import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if (str.equals("1")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            Square square = new Square(a,b);
            Square.SquareP();
            Square.SquareS();
        }

        else if (str.equals("2")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
            int d = Integer.parseInt(scanner.nextLine());

            Triangle triangle = new Triangle(a,b,c,d);
            Triangle.TriangleP();
            Triangle.TriangleS();

        }

        else if (str.equals("3")){
            int a = Integer.parseInt(scanner.nextLine());

            Circle circle = new Circle(a);
            Circle.CircleP();
            Circle.CircleS();

        }

        else if (str.equals("4")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            Pentagon pentagon = new Pentagon(a, b);
            Pentagon.PentagonP();
            Pentagon.PentagonS();

        }

        else if (str.equals("5")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
            int d = Integer.parseInt(scanner.nextLine());
            int e = Integer.parseInt(scanner.nextLine());



            Trapezoid trapezoid = new Trapezoid(a, b,c,d,e);
            Trapezoid.TrapezoidP();
            Trapezoid.TrapezoidS();

        }

        else if (str.equals("6")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());


            Rectangle rectangle = new Rectangle(a,b);
            Rectangle.RectangleP();
            Rectangle.RectangleS();

        }

        else if (str.equals("7")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());


            Parallelogram parallelogram = new Parallelogram(a,b,c);
            Parallelogram.ParallelogramP();
            Parallelogram.ParallelogramS();

        }

        else if (str.equals("8")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
            int d = Integer.parseInt(scanner.nextLine());
            int e = Integer.parseInt(scanner.nextLine());



            Paralelipiped paralelipiped = new Paralelipiped(a,b,c,d,e);
            Paralelipiped.ParalelipipedP();
            Paralelipiped.ParalelipipedS();

        }

        else if (str.equals("9")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());

            Cilinder cilinder = new Cilinder(a,b,c);
            Cilinder.CilinderP();
            Cilinder.CilinderS();

        }

        else if (str.equals("10")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());


            Romb cilinder = new Romb(a,b);
            Romb.RombP();
            Romb.RombS();

        }

        else if (str.equals("11")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());


            Conus conus = new Conus(a,b);
            Conus.ConusS();

        }


        else if (str.equals("12")){
            int a = Integer.parseInt(scanner.nextLine());


            Sphere sphere = new Sphere(a);
            Sphere.SphereP();
            Sphere.SphereS();

        }






    }
}