package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("word");
    hello("Alex");
   Square s = new Square(5);
   System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

   Rectangle r = new Rectangle(4,6);
   System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

   Point p = new Point (4, 6, 8, 10);
   System.out.println("Расстояние между двумя точкамии " + " x1y1 " + p.x1 + " , " + p.x2 + " и " + " x2y2 " + p.y1 + " , " + p.y2 +  "= " + p.area ());


    //distance = Math.sqrt((x1-x2)(x1-x2) + (y1-y2)(y1-y2));

  }

  public static void hello(String somedody) {
    System.out.println("Hello, " + somedody + " !!!");
  }


}