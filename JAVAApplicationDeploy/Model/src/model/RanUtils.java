package model;

public class RanUtils {
  public static NumberBean randomNum(String rangeString) {
    double rang;
    try {
      rang = Double.parseDouble(rangeString);
    } catch(Exception e) {
      rang = 10.0;
    }
    return(new NumberBean(Math.random() * rang));
  }
  
  private RanUtils() {} // Uninstantiable class
}
