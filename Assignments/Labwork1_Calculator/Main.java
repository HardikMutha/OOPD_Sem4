public class Main {
  public static void main(String[] args) {
    int sum = Calculator.add(10, 12);
    int diff = Calculator.subtract(45, 24);
    int inc = Calculator.increment(65);
    int dec = Calculator.decrement(88);
    int modulus = Calculator.modulus(55, 12);
    double divide = Calculator.divide(442.23, 34.21);
    System.out.println(sum);
    System.out.println(diff);
    System.out.println(inc);
    System.out.println(dec);
    System.out.println(divide);
    System.out.println(modulus);
  }
}
