package scala_study
import Array._

//reference links:
// - https://www.geeksforgeeks.org/scala-arrays/

object arrays_test {

  def main(args: Array[String]): Unit = {


    println("------allocating memory of 1D Array of string")
    var days = Array("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat" )
    //elements
    for (array_val <- days){
      println(array_val)
    }

    println("\n------array instantiation then assignment")
    //import statement needed: import Array._
    var name = new Array[String](4)

    // Adding element in an array
    name(0)="hello"
    name(1)="its"
    name(2)="a nice"
    name(3)="day"
    for (array_val <- name){
      println(array_val)
    }

    println("\n------array concatenation")
    val concat_arr=concat(days,name)
    for (array_val <- concat_arr){
      println(array_val)
    }


    println("\n------2D arrays")

    val row_num = 2
    val col_num = 3

    // Declaring Multidimensional array
    val names = Array.ofDim[String](row_num, col_num)

    // Allocating data to array
    names(0)(0) = "#"
    names(0)(1) = "first_name"
    names(0)(2) = "last_name"
    names(1)(0) = "1"
    names(1)(1) = "rim"
    names(1)(2) = "sa"

    println(names(0)(0) +"\t"+ names(0)(1)+"\t"+ names(0)(2))
    println(names(1)(0) +"\t"+ names(1)(1)+ "\t"+ names(1)(2))

  }

}
