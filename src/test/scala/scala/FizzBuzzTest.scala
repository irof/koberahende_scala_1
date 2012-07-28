package scala

import org.scalatest._
import java_.{FizzBuzz => JFizzBuzz}
import groovy.{FizzBuzz => GFizzBuzz}

class FizzBuzzTest extends FunSpec {

  describe("JavaFizzBuzz") {
    it ("should return 'FizzBuzz' from a multiple of fifty") {
      assert(new JFizzBuzz().invoke(15) == "FizzBuzz")
    }
    it ("should return 'Fizz' from a multiple of three only") {
      assert(new JFizzBuzz().invoke(3) == "Fizz")
    }
    it ("should return 'Buzz' from a multiple of five only") {
      assert(new JFizzBuzz().invoke(5) == "Buzz")
    }
    it ("should return the stringified input from a non multiple of three or five") {
      assert(new JFizzBuzz().invoke(15) == "FizzBuzz")
    }
  }

  describe("ScalaFizzBuzz") {
    it ("should return 'FizzBuzz' from a multiple of fifty") {
      assert(new FizzBuzz().invoke(15) == "FizzBuzz")
    }
    it ("should return 'Fizz' from a multiple of three only") {
      assert(new FizzBuzz().invoke(3) == "Fizz")
    }
    it ("should return 'Buzz' from a multiple of five only") {
      assert(new FizzBuzz().invoke(5) == "Buzz")
    }
    it ("should return the stringified input from a non multiple of three or five") {
      assert(new FizzBuzz().invoke(15) == "FizzBuzz")
    }
  }

  describe("GroovyFizzBuzz") {
    it ("should return 'FizzBuzz' from a multiple of fifty") {
      assert(new GFizzBuzz().invoke(15) == "FizzBuzz")
    }
    it ("should return 'Fizz' from a multiple of three only") {
      assert(new GFizzBuzz().invoke(3) == "Fizz")
    }
    it ("should return 'Buzz' from a multiple of five only") {
      assert(new GFizzBuzz().invoke(5) == "Buzz")
    }
    it ("should return the stringified input from a non multiple of three or five") {
      assert(new GFizzBuzz().invoke(15) == "FizzBuzz")
    }
  }
}

