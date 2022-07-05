package lectures.basics

object Expressions extends App {

  // Expression
  val x = 1 + 2
  println(x)

  // Math Expression
  // + - * / & ^ << >>
  // >>> (right shift with zero extension)
  println(2 + 3 * 4)

  // Relational Expressions
  // == !+ > >= < <=
  println(1 == x)

  // Boolean Expressions
  // ! && ||
  println(!(1 == x))

  var aVariable = 2
  // Also works with -= *= /=
  // Only works with Variables
  aVariable += 3
  println(aVariable)


  // Instructions vs Expressions
  // Instructions are something you tell the computer to do. (DO)
  // Expressions are something that has a value or type (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)


  // NEVER WRITE THIS AGAIN
  var i = 0
  val aWhile: Unit = while (i < 10) {
    println(i)
    i += 1
  }
  // EVERYTHING IN SCALA IS AN EXPRESSION!!!

  // Unit === void
  val aWierdValue: Unit = aVariable = 3
  println(aWierdValue)

  // Side effects include: println(), whiles, reassigning variables

  // Code Blocks (special kinds of expressions)
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "bye"
  }
  // Not able to be found outside of code block
  // val anotherValue = z + 1


  // 1. Difference between "hello world" and println("hello world")
  // "Hello world" is a variable while println("Hello world") is an expression
    // *** "Hello world" is a string literal
    // *** println("Hello world") is a side effect / expression

  // 2. What is the value of the following:

  val someValue = {
    2 < 3
  }

  // True.
    // *** True.

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  // 239
    // *** 42 (Based off of last VALUE not EXPRESSION)
}
