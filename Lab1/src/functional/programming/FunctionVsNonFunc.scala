package functional.programming

// Basic concept of functional programming
// 1. There can not exist assignment statements in functional programming
// 2. There can not exist for/while loops in functional programming
// 3. Recursion everywhere
object FunctionVsNonFunc {

  // factorial(n) = n * (n-1) * ... * 1
  
  // A non-functional implementation
  def factorial_nonfunc(n: Int): Int = { 
    var v = 1
    var i = 0
    for( i <- 1 to n ) {
      v = v*i
    }
    
    v // By default, Scala return the last expression, you can also explicitly write "return v"  
  }
  
  // A functional implementation
  def factorial_func(n: Int): Int = 
    if (n == 1) 1 else n * factorial_func(n-1)
  
  def main(args: Array[String]) {
    
    println(factorial_nonfunc(5))
    println(factorial_func(5))
  }
}

// Advantages of functional programming
// 1. High readability (concise)
// 2. Support parallel execution easily (everything is immutable, no critical sections)
// 3. Reliable (easy to prove program correctness)