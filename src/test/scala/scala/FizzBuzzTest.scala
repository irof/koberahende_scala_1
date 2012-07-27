package scala

import org.scalatest._
import java_.{FizzBuzz => JFizzBuzz}
import groovy.{FizzBuzz => GFizzBuzz}
import FizzBuzz._

class FizzBuzzTest extends FunSpec {

  describe("JavaFizzBuzz") {
    it ("should return 'FizzBuzz' from a multiple of fifty") {
      assert(new JFizzBuzz().fizzBuzz(15) == "FizzBuzz")
    }
    it ("should return 'Fizz' from a multiple of three only") {
      assert(new JFizzBuzz().fizzBuzz(3) == "Fizz")
    }
    it ("should return 'Buzz' from a multiple of five only") {
      assert(new JFizzBuzz().fizzBuzz(5) == "Buzz")
    }
    it ("should return the stringified input from a non multiple of three or five") {
      assert(new JFizzBuzz().fizzBuzz(15) == "FizzBuzz")
    }
  }

  describe("ScalaFizzBuzz") {
    it ("should return 'FizzBuzz' from a multiple of fifty") {
      assert(fizzBuzz(15) == "FizzBuzz")
    }
    it ("should return 'Fizz' from a multiple of three only") {
      assert(fizzBuzz(3) == "Fizz")
    }
    it ("should return 'Buzz' from a multiple of five only") {
      assert(fizzBuzz(5) == "Buzz")
    }
    it ("should return the stringified input from a non multiple of three or five") {
      assert(fizzBuzz(15) == "FizzBuzz")
    }
  }

  describe("GroovyFizzBuzz") {
    it ("should return 'FizzBuzz' from a multiple of fifty") {
      assert(GFizzBuzz.fizzBuzz(15) == "FizzBuzz")
    }
    it ("should return 'Fizz' from a multiple of three only") {
      assert(GFizzBuzz.fizzBuzz(3) == "Fizz")
    }
    it ("should return 'Buzz' from a multiple of five only") {
      assert(GFizzBuzz.fizzBuzz(5) == "Buzz")
    }
    it ("should return the stringified input from a non multiple of three or five") {
      assert(GFizzBuzz.fizzBuzz(15) == "FizzBuzz")
    }
  }
}

