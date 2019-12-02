package scala_study
import Array._

//reference links:
// - https://www.geeksforgeeks.org/scala-arrays/
// - https://www.tutorialspoint.com/scala/scala_arrays.htm

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

    println("\n------append one value>  :+ ")
    val base_arr= Array(12,32,546)
    val append_1= base_arr:+33
    for (array_val <- append_1){
      println(array_val)
    }

    println("\n------append multiple values> ++")
    val append_2 = base_arr ++ Array(0,2)
    for (array_val <- append_2){
      println(array_val)
    }

    println("\n------prepend one value>  +: ")
    val append_3= 33+:base_arr
    for (array_val <- append_3){
      println(array_val)
    }

//    println("\n------prepend multiple values> :++")
//    val applend_4 = Array(0,2) :++ base_arr
//    for (array_val <- append_4){
//      println(array_val)
//    }

    println("\n------build array with range ")
    val range_test_1=range(10,15)
    for (array_val <- range_test_1){
      println(array_val)
    }

    println("\n------build array with range and increment")
    val range_test_2=range(10,30,4)
    for (array_val <- range_test_2){
      println(array_val)
    }


    println("\n------build array with range and decrement")
    val range_test_3=range(30,10,-4)
    for (array_val <- range_test_3){
      println(array_val)
    }





  }

}
