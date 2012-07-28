package spock

import spock.lang.*

class FizzBuzzTest extends Specification {

  @Unroll
  def "Javaで #num の時 #res になる"() {
    expect:
    new java_.FizzBuzz().invoke(num) == res

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
    new scala.FizzBuzz().invoke(num) == res

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
    new groovy.FizzBuzz().invoke(num) == res

    where:
    num   | res
    1     | '1'
    3     | 'Fizz'
    5     | 'Buzz'
    15    | 'FizzBuzz'
  }
}
