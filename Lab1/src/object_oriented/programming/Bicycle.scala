package object_oriented.programming

// 1. The constructor in Scala is the class' body and it's parameter list comes right after the class name 
// 2. By default, the parameters in the constructor are immutable 
class Bicycle(color: String) {
  def col = color
}

// Inheritance in Scala
class MoutainBicycle(color: String) extends Bicycle(color) {
  def changeGear = println("The bicycle has changed gear!")
}

object Bicycle {
  def main(args: Array[String]) {
    
    // mutable variables are defined as var 
    var b = new MoutainBicycle("blue")
    
    println("The color of the bicycle: " + b.col)
    b.changeGear
      
    b = new MoutainBicycle("yellow")
    println("The color of the bicycle: " + b.col)
    b.changeGear

  }
}