package groovy

public class FizzBuzz implements interfaces.FizzBuzz {
  public String invoke(int i) {
    (i%15==0)?"FizzBuzz":(i%3==0)?"Fizz":(i%5==0)?"Buzz":i
  }
}
