public class CtoFTester{
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(30)); //tester lines
    System.out.println(fahrenheitToCelsius(25.4));
  }
  public static double celsiusToFahrenheit(double celsius){ //so that decimals are included as well
    return ((celsius * (9/5)) + 32);
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    return ((fahrenheit - 32) * 5/9);

  }
}
