package junit;

import org.junit.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

//@RunWith(Enclosed.class)
public class FizzBuzzTest {

	@Ignore
	public abstract static class _FizzBuzz {
		protected interfaces.FizzBuzz sut;

		@Test
		public void 何の倍数でもない() {
			assertThat(sut.invoke(1), is("1"));
		}

		@Test
		public void 三の倍数() {
			assertThat(sut.invoke(3), is("Fizz"));
		}

		@Test
		public void 五の倍数() {
			assertThat(sut.invoke(5), is("Buzz"));
		}

		@Test
		public void 十五の倍数() {
			assertThat(sut.invoke(15), is("FizzBuzz"));
		}
	}

	public static class FizzBuzzJava extends _FizzBuzz {
		@Before
		public void before() {
			sut = new java_.FizzBuzz();
		}
	}

	public static class FizzBuzzScala extends _FizzBuzz {
		@Before
		public void before() {
			sut = new scala.FizzBuzz();
		}
	}

	public static class FizzBuzzGroovy extends _FizzBuzz {
		@Before
		public void before() {
			sut = new groovy.FizzBuzz();
		}
	}
}
