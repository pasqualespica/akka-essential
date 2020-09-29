package part1recap

import scala.util.Try

object GeneralRecap extends App {

  val aCondition : Boolean = false // not re-assign

  var aVariable = 42
  aVariable += 1

  // expression
  val aCondVal = if (aCondition) 42 else 54

  // code block
  val aCodeBlock = {
    if ( aCondition ) 74
    54
  }

  // types
  // Unit
  val theUnit = println("Hello Scala ...")

  // function
  def aFunc(x : Int) : Int = x + 1

  // recursion - TAIL recursion
  @scala.annotation.tailrec
  def factorial(n: Int, acc: Int): Int =
    if (n <= 0) acc
    else factorial(n - 1, acc * n)

  // OOP

  class Animal
  class Dog extends Animal
  val aDog: Animal = new Dog

  // abstract class
  trait Carnivore {
    def eat(a: Animal): Unit // abstract method
  }

  class Crocodile extends Animal with Carnivore {  // 1 class and many traits
    override def eat(a: Animal): Unit = println("crunch!")
  }

  // method notations
  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog

  // anonymous classes
  val aCarnivore = new Carnivore {
    override def eat(a: Animal): Unit = println("roar")
  }

  aCarnivore eat aDog

  // generics
  abstract class MyList[+A]
  // companion objects
  object MyList

  // case classes
  case class Person(name: String, age: Int) // a LOT in this course!

  // Exceptions
  val aPotentialFailure = try {
    throw new RuntimeException("I'm innocent, I swear!") // Nothing
  } catch {
    case e: Exception => "I caught an exception!"
  } finally  {
    // side effects
    println("some logs")
  }

  // Functional programming

  val incrementer = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }

  val incremented = incrementer(42) // 43
  // incrementer.apply(42)

  val anonymousIncrementer = (x: Int) => x + 1
  // Int => Int === Function1[Int, Int]

  // FP is all about working with functions as first-class
  val pippo : List[Int] = List(1,2,3).map(incrementer)
  println(s"Lista incrementato $pippo")

  // map = HOF - higher-Order function

  // for comprehensions
  val pairs = for {
    num <- List(1,2,3,4, 5)
    char <- List('a', 'b', 'c', 'd')
  } yield num + "-" + char

  println(s"for comprehensions $pairs")


  // List(1,2,3,4).flatMap(num => List('a', 'b', 'c', 'd').map(char => num + "-" + char))

  // Seq, Array, List, Vector, Map, Tuples, Sets

  // "collections"
  // Option and Try
  val anOption = Some(2)
  val aTry = Try {
    throw new RuntimeException
  }

  // pattern matching
  val unknown = 2
  val order = unknown match {
    case 1 => "first"
    case 2 => "second"
    case _ => "unknown"
  }

  val bob = Person("Bob", 22)
  val greeting = bob match {
    case Person(n, _) => s"Hi, my name is $n"
    case _ => "I don't know my name"
  }

  println(greeting)

  // ALL THE PATTERNS



}
