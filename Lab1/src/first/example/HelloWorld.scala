package first.example

// In Scala, only the structure defined as "object" can be run. It corresponds to the singleton object
// in Java. The main reason that Scala creates the "object" type is to get rid of the "static" keyword.
// "Static" declaration is actually not a good object-oriented design. 
object HelloWorld {
  
  // 1. The object must contain a main method
  // 2. Different from Java, you cannot declare it as static since Scala has no "static" keyword
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}