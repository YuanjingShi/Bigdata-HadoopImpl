package collections.inScala

// Collections (e.g. List, Map, Array, etc.) are very useful classes in Scala. 
// They will ease your job when you are doing analytical tasks.
object ScalaCollections {

  def main(args: Array[String]) {
    val a = List(1,2,3,4,5,6)
    
    // map is a high order function that applies a function on all elements of a sequence
    val b = a.map(x => x * x)
    
    // filter is a high order function that selects a set of values from a sequence based on the boolean value 
    // returned by a function passed as its parameter
    val c = a.filter(x => x < 5)
    
    // reduce is a high order function iterates over each sequential pair of values in the Collection and 
    // uses a function parameter to combine the values in some way. 
    // In this example, it works like as follows.
    //             ?
    //             |
    //             +
    //            / \
    //           +   6
    //          / \
    //         +   5
    //        / \
    //       +   4
    //      / \
    //     +   3
    //    / \
    //   1   2
    val d = a.reduce((x, y) => x + y)
    
    println(b)
    println(c)
    println(d)
    
  }
}