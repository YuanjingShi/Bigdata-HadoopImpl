package functional.programming

// More about functional programming in Scala
// 1. High order function.  It is a function that does at least one of the following:
//		(a)	takes one or more functions as an input
//      (b) outputs a function
// 2. Anonymous function.  It is a function definition that is not bound to an identifier
object Sum {
  
  def nochange(x: Int) = x
  def sqr(x: Int) = x * x
  def cube(x: Int) = x * x * x

  // sum a + (a+1) + ... + b 
  def sumSimple(a: Int, b: Int): Int = if (a == b) a else a + sumSimple(a + 1, b)
  
  // sum a*a + (a+1)*(a+1) + ... + b*b
  def sumSquare(a: Int, b: Int): Int = if (a == b) sqr(a) else sqr(a) + sumSquare(a + 1, b)
  
  // sum a*a*a + (a+1)*(a+1)*(a+1) + ... + b*b*b
  def sumCube(a: Int, b: Int): Int = if (a == b) cube(a) else cube(a) + sumCube(a + 1, b)
	

  // 1. "sum" is a "high order" function. Its first parameter "f" is a function which maps an Int to an Int 
  // 2. The type Int => Int represents a function which accepts an Int and returns an Int
  def sum(f: Int=>Int, a: Int, b: Int): Int =
	if(a == b) f(a) else f(a) + sum(f, a + 1, b)
	
  
  def main(args: Array[String]) {
	  
	// Normal implementation
	println(sumSimple(1, 10))
	println(sumSquare(1, 10))
	println(sumCube(1, 10))
    
	// High order function
	println(sum(nochange, 1, 10))
    println(sum(sqr, 1, 10))
    println(sum(cube, 1, 10))	  
	  
    // High order function with anonymous functions
    println(sum(x=>x, 1, 10))
    println(sum(x=>x*x, 1, 10))
    println(sum(x=>x*x*x, 1, 10))	 
  }
}