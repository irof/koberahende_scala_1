package java_;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

  @Test
  public void fizzBuzzJava() {
    FizzBuzz sut = new FizzBuzz();
    assertThat(sut.fizzBuzz(1), is("1"));
    assertThat(sut.fizzBuzz(3), is("Fizz"));
    assertThat(sut.fizzBuzz(5), is("Buzz"));
    assertThat(sut.fizzBuzz(15), is("FizzBuzz"));
  }

  @Test
  public void fizzBuzzScala() {
    assertThat(scala.FizzBuzz.fizzBuzz(1), is("1"));
    assertThat(scala.FizzBuzz.fizzBuzz(3), is("Fizz"));
    assertThat(scala.FizzBuzz.fizzBuzz(5), is("Buzz"));
    assertThat(scala.FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
  }

  @Test
  public void fizzBuzzGroovy() {
    assertThat(groovy.FizzBuzz.fizzBuzz(1), is("1"));
    assertThat(groovy.FizzBuzz.fizzBuzz(3), is("Fizz"));
    assertThat(groovy.FizzBuzz.fizzBuzz(5), is("Buzz"));
    assertThat(groovy.FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
  }
}
