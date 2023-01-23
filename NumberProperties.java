public class NumberProperties {
  private int number;

// Complete this constructor so it takes an integer as input,
// which gets stored in the number attribute.
  public NumberProperties(int n) {
   number=n;
  }
    
// Complete this method so it returns true when the number attribute is prime,
// or false otherwise. You do not need to worry about efficiency issues.    
  public boolean isPrime() {
     boolean track = false;
     for(int i=2;i<=this.number/2;++i){
        if (this.number%i==0) {
          track = true;
          break;
        }
      }
     return (!track) ? true : false;
  }

// Complete this method so that it returns true
// when the number attribute and the input parameter
// are relatively prime.   
  public boolean relativelyPrime(int anotherNumber) { 
   for(int i=2; i<=number; ++i){
      if(number%i==0 && anotherNumber%i==0){
         return false;
      }
   }
   return true;
 }

// Compete this get method for the number attribute.
  public int getNumber(){
    return number;
  }
 
 // Complete this set method for the nuber attribute.   
  public void setNumber(int n){    
   this.number = n; //this. referrs to the current object which is number
  }
}
