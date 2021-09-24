/* (originally written in a text file)
1) the functions should have either a input representing celsious or an input representing fahrenheit.
2) they should be booleans to account for possible decimals
3) the functions should return either a celcius input calculated into fahrenheit or a fahrenheit input calculated into celcius*/


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
