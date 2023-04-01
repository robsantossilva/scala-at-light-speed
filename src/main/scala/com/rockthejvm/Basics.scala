package com.rockthejvm

object Basics extends App{
  val meaningOfLife: Int = 42 //cont int meaningOfLife = 42;

  // Int, Boolean, Char, Double, Float, String
  val aBoolean = false // type is optional

  val aString = "I Love Scala"
  val aComposedString = "I" + " " + "Love" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // expression = structures tha can be reduced to a value
  val anExpression = 2 +3

  // if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999 // in other languages: meaningOfLife > 43 ? 56 : 999
  val chainedIfExpression =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0

  // code blocks
  val aCodeBlock = {
    val aLocalValue = 67

    // Value of block is the value of the last expression
    aLocalValue + 3
  }

  // define a function
  def myFunctionInline(x: Int, y: String): String = y + " " + x
  def myFunctionBlock(x: Int, y: String): String =
  {
    y + " " + x
  }

  // recursive function
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n -1)

  /*
  * factorial(5)
  * */
  println(factorial(5))

  // In Scala we don't use loops or iteration, we use RECURSION!

  // the Unit type = no meaningful value === "void" in other languages
  // type of SIDE EFFECTS
  println("I love Scala") // System.out.println, printf, print, console.log

  def myUnitReturnFunction(): Unit = {
    println("I don't love returning Unit")
  }

  println(myUnitReturnFunction())

  val theUnit = ()

  println(theUnit)

}
