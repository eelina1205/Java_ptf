package ru.stqa.pft.sandbox;

public class Point {
  public double c;
  public double d;
  public Point (double c, double d){
    this.c = c;
    this.d = d;

  }
  public double area() {
    return this.c - this.d;
  }
}
