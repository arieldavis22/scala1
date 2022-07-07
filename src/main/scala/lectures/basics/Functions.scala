package lectures.basics

object Functions extends App {

    def aFunction(a: String, b: Int): String = {
      a + " " + b
    }
    println(aFunction("Hello", 3))

  // WHEN YOU NEED LOOPS USE RECURSION!
    def aRepeatedFunction(aString: String, n: Int): String = {
      if (n == 1) aString
      else aString + aRepeatedFunction(aString, n - 1)
    }

    println(aRepeatedFunction("hello", 3))


    def aFunctionWithSideEffects(aString: String): Unit = println(aString)

    def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

      aSmallerFunction(n, n-1)
    }

    /*
      1. A greeting function (name, age) => "Hi my name is $name and I am $age years old."
      2. Factorial Function 1 * 2 * 3 * ... * n
      3. A Fibonacci Function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n)
      4. Tests if a number is prime
    */

    def aGreetingFunction(name: String, age: Int): String =
      "Hi my name is " + name + " and I am " + age + " years old."

    def aFactorialFunction(n: Int): Int = {
      if (n == 1) n
      else n * aFactorialFunction(n - 1)
    }

    println(aFactorialFunction(1))

    def aFibonacciFunction(n: Int): Int = {
      if (n <= 1) 1
      else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
    }

    println(aFibonacciFunction(3))

    def aPrimeNumber(n: Int): Boolean = {
      if (n % 2 == 0 && n != 2) false
      else true
    }
}
