package ru.stqa.pft.sandbox;
import org.testng.annotations.Test;

public class PointTest2 {


  @Test
  public void testArea(){
    Point p = new Point (4,6,8, 10);
    assert p.area() == 2.8;
  }
}
