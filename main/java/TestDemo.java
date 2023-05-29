 

import java.util.Random;

public class TestDemo {
  
// method prints out the sum of int a + b
  public int addPositive(int a, int b) {

    if (a <= 0 || b <= 0) {
      throw new IllegalArgumentException("Both parameters must be positive!");
    }
    return a + b; 
  }
  
  // method prints out the result of randomNumberSquared. 
  public int randomNumberSquared() {
    int randomInt = getRandomInt();
    return randomInt * randomInt;
    
  }

  // method prints out random integer between 1 and 10. 
  public int getRandomInt() {
    Random random = new Random();
    return random.nextInt(10) + 1;
    
  }
}

