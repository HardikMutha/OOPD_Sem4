public class Calculator {

  static int add(int a,int b){
    return a+b;
  }
  static double add(double a, double b){
    return a+b;
  }
  static int subtract(int a,int b){
    return a-b;
  }
  static double subtract(double a,double b){
    return a-b;
  }
  static int multiply(int a,int b){
    return a*b;
  }
  static double multiply(double a,double b){
    return a*b;
  }
  static double divide(int a,int b){
    if(b!=0)
      return a/(b*1.0);
    else
      return 0.0;
  }
  static double divide(double a,double b){
    if(b!=0.0)
      return a/b;
    else
      return 0.0;
  }
  static int modulus(int a,int b){
    if(b!=0)
      return a%b;
    else
      return 0;
  }
  static double modulus(double a,double b){
    if(b!=0.0)
      return a%b;
    else
      return 0;
  }
  static int increment(int a){
    a++;
    return a;
  }
  static int decrement(int a){
    a--;
    return a;
  }

}
