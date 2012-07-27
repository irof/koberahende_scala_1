package scala

object FizzBuzz {
  def fizzBuzz(num: Int): String = {
    (num % 3, num % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _      => num.toString
    }
  }
}

