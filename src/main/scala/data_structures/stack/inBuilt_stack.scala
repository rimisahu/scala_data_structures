package data_structures.stack
import scala.collection.mutable.Stack


object inBuilt_stack extends App {

  //creating stack
  var fruits = Stack[String]()

  println("\nis stack empty? " + fruits.isEmpty)

  fruits.push("apple")
  fruits.push("banana")
  fruits.push("pear")

  println("\nprinting all pushes to a stack")
  fruits.foreach(n=>println(n))

  println("\nis stack empty? " + fruits.isEmpty)

  fruits.pop()
  println("\nprinting pop from a stack")
  fruits.foreach(n=>println(n))

  println("\nis stack empty? " + fruits.isEmpty)

  println("top of stack: "+ fruits.top)

}
