object NewtonSqrt {

  //Functions like sqrtIter,improve, and isGoodEnough are ONLY used as the auxiliary functions for sqrt, so we put them inside sqrt.
  def sqrt(target: Double): Double = {

    //Test whether the guess is good enough
    //I.e., test whether Math.abs(guess * guess - target) / target is smaller than a threshold (e.g., 0.001)
    def isGoodEnough(guess: Double): Boolean =
    //snippet 1: PUT YOUR CODE HERE
      Math.abs((guess * guess - target) / target) <= 0.00001 

     //Take the mean of guess and target/guess to improve the guess
    def improve(guess: Double): Double = (guess + target/guess)
    //snippet 2: PUT YOUR CODE HERE

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess)) //It looks like a if-else in Java, but is used for expressions, not statements

     //The return expression of the function sqrt(target: Double). Here we set the initial guess (i.e., estimate) as 1
    sqrtIter(1.0)
  }

  def main(args: Array[String]) {
    println(sqrt(2.0));
  }
}