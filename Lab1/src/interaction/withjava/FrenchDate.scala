package interaction.withjava

// Scala supports all existing Java classes
import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {
  def main(args: Array[String]) {
	// immutable variable is defined as "val" 
    val now = new Date
    
    // mutable variable is defined as "var"
    var df = getDateInstance(LONG, Locale.FRANCE)
    
    // try to uncommnet the following code
    // now = new Date
   
    // You can call the function like Java
    println(df.format(now))
    
    // Change value of mutable variable
    df = getDateInstance(LONG, Locale.ENGLISH)
    
    // Methods taking one argument can be used with an infix syntax
    println(df format now)
  }
}