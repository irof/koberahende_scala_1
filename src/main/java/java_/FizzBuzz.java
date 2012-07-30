package java_;

public class FizzBuzz implements interfaces.FizzBuzz {

	public String invoke(int i) {
		if (i % 15 == 0) {
			return "FizzBuzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else if (i % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(i);
	}
}
