package ru.stqa.pft.sandbox;
import org.testng.annotations.Test;

public class PointTests1 {


  @Test
  public void testArea(){
    Point p = new Point (4,6,8, 10);
    assert p.area() == 2.8284271247461903;
  }
}
