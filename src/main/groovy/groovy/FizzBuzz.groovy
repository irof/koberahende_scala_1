package groovy

public class FizzBuzz {
  public static String fizzBuzz(def i) {
    (i%15==0)?"FizzBuzz":(i%3==0)?"Fizz":(i%5==0)?"Buzz":i
  }
}
