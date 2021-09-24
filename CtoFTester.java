
//The functions should have parameters of Celcius and Fahrenheit. The type should be double. The function should return either
//Celcius or Fahrenheit.



public class CtoFTester{

public static void main(String[] args) {
  System.out.println("100 C = " + CtoF(100) + " F");
  System.out.println("81 F = " + FtoC(81) + " C");
}


public static double CtoF(double Celcius){
return Celcius * 9 / 5 + 32;

}

public static double FtoC(double Fahrenheit){
  return (Fahrenheit - 32) * 5 / 9;
}
}
