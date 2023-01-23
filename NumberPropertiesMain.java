public class NumberPropertiesMain {
  public static void main(String[] args) {
    NumberProperties forTesting = new NumberProperties(17);
    int x = 25;
    System.out.println("is " + forTesting.getNumber() + " prime? " + forTesting.isPrime());
    System.out.println( "are " + forTesting.getNumber() + " and " + x + " relatively prime? " + forTesting.relativelyPrime(x));
    forTesting.setNumber(23);
    System.out.println("is " + forTesting.getNumber() + " prime? " + forTesting.isPrime());    
  }
}