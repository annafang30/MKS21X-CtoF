public class CtoFTester{
  public static void main(String[] args) {
    System.out.print(celsiusToFahrenheit(30));
    System.out.println(fahrenheitToCelsius(25.4));
  }
  public static double celsiusToFahrenheit(double celsius){
    return ((celsius * (9/5)) + 32);
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    return ((fahrenheit - 32) * 5/9);

  }
}
