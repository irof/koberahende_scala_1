package groovy

import spock.lang.*

class FizzBuzzTest extends Specification {

  @Unroll
  def "Javaで #num の時 #res になる"() {
    expect:
    new java_.FizzBuzz().fizzBuzz(num) == res

    where:
    num   | res
    1     | '1'
    3     | 'Fizz'
    5     | 'Buzz'
    15    | 'FizzBuzz'
  }

  @Unroll
  def "Scalaで #num の時 #res になる"() {
    expect:
    scala.FizzBuzz.fizzBuzz(num) == res

    where:
    num   | res
    1     | '1'
    3     | 'Fizz'
    5     | 'Buzz'
    15    | 'FizzBuzz'
  }

  @Unroll
  def "Groovyで #num の時 #res になる"() {
    expect:
    FizzBuzz.fizzBuzz(num) == res

    where:
    num   | res
    1     | '1'
    3     | 'Fizz'
    5     | 'Buzz'
    15    | 'FizzBuzz'
  }
}
