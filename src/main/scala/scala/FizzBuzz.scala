package scala

class FizzBuzz extends interfaces.FizzBuzz {

  def invoke(num: Int): String = {
    type FB = PartialFunction[Int, String]
    val fb: FB = { case i if i % 15 == 0 => "FizzBuzz" }
    val b: FB = { case i if i % 5 == 0 => "Buzz" }
    val f: FB = { case i if i % 3 == 0 => "Fizz" }
    val a: FB = { case i => i.toString }
    val fizzBuzz = fb orElse f orElse b orElse a
    fizzBuzz(num)
  }

}

