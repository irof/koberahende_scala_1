package java_;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzJava() {
		interfaces.FizzBuzz sut = new FizzBuzz();
		assertThat(sut.invoke(1), is("1"));
		assertThat(sut.invoke(3), is("Fizz"));
		assertThat(sut.invoke(5), is("Buzz"));
		assertThat(sut.invoke(15), is("FizzBuzz"));
	}

	@Test
	public void fizzBuzzScala() {
		interfaces.FizzBuzz sut = new scala.FizzBuzz();
		assertThat(sut.invoke(1), is("1"));
		assertThat(sut.invoke(3), is("Fizz"));
		assertThat(sut.invoke(5), is("Buzz"));
		assertThat(sut.invoke(15), is("FizzBuzz"));
	}

	@Test
	public void fizzBuzzGroovy() {
		interfaces.FizzBuzz sut = new groovy.FizzBuzz();
		assertThat(sut.invoke(1), is("1"));
		assertThat(sut.invoke(3), is("Fizz"));
		assertThat(sut.invoke(5), is("Buzz"));
		assertThat(sut.invoke(15), is("FizzBuzz"));
	}
}
