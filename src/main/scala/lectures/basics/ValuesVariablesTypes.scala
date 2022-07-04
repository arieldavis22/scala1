package lectures.basics

object ValuesVariablesTypes extends App {

  // Declares a Value
  // Values cannot be reassigned. Immutable.
  // Types of Values are optional. Compiler can infer type of value.
  val x: Int = 42
  println(x)

  val aString: String = "Hello"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 1413
  val aLong: Long = 1892734917389127L
  val aFloat: Float = 0.1f
  val aDouble: Double = 3.14


  // Variables
  var aVariable: Int = 4

  // Side effects
  aVariable = 5



}
