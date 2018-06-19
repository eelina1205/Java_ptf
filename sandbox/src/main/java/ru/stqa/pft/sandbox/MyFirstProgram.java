package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("word");
    hello("Alex");
   Square s = new Square(5);
   System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

   Rectangle r = new Rectangle(4,6);
   System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

   Point p = new Point(10,2);
   System.out.println("Расстояние между двумя точкамии " + p.c + " и " + p.d + " = " + p.area ());

  }

  public static void hello(String somedody) {
    System.out.println("Hello, " + somedody + " !!!");
  }


}