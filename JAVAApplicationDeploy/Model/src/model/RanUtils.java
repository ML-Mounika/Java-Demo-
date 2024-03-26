package model;

public class RanUtils {
  public static NumberBean randomNum(String rangeString) {
    double ranges;
    try {
      ranges = Double.parseDouble(rangeString);
    } catch(Exception e) 
      {
      ranges = 10.0;
    }
    return(new NumberBean(Math.random() * ranges));
  }
  
  private RanUtils() {} // Uninstantiable class
}
