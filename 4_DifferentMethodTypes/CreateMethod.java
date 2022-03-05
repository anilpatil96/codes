


public class CreateMethod {
    static void myMethod() {
      System.out.println("I just got executed!");
    }
    static void mymethodsum(int a, int b) {
        System.out.println("the sum is "+ (a + b));
      }
      
  
    public static void main(String[] args) {
      myMethod();
      mymethodsum(5,6);
    }
  }
