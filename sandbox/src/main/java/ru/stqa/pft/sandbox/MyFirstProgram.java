package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("word");
    hello("Alex");
    double l = 5;
    System.out.println("Площадь квадрата со сторонтй " + l + "=" + area(l));
    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами" + a + " и " + b + " = " + area(a, b));
  }

  public static void hello(String somedody) {
    System.out.println("Hello, " + somedody + " !!!");

  }

  public static double area(double l) {
    return l * l;

  }

  public static double area(double a, double b) {
    return a * b;
  }
}