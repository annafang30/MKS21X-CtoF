public class CtoFTester{
  public static void main(String[] args) {
    System.out.print(celsiusToFahrenheit(30));
    System.out.print(fahrenheitToCelsius(25.4));
  }
  public static double celsiusToFahrenheit(double celsius){
    double ctfConversion = ((celsius * (9/5)) + 32);
    return(ctfconversion);
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    double ftcConversion = ((fahrenheit - 32) * 5/9);
    return ftcConversion;
  }
}
