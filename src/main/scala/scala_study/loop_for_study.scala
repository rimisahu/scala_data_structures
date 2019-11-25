package scala_study

object loop_for_study {

  def main(args: Array[String]): Unit = {

    println("\n------normal for ")
    for (i <- 0 to 7) {
      println(i)
    }

    println("\n------nested for ")
    //i is the outer loop, j is the inner loop
    for (i <- 0 to 3; j <- 0 to 5) {
      println("value i: " + i + " value j:  " + j)
    }

    println("\n------use of for with a List data type")
    val list_data = List(12, 32, 53, 234, 52, 9)
    for (i <- list_data) {
      println(i)
    }


    println("\n------use of for with if condition")

    for (i <- list_data if i>50; if i!=52) {
      println(i)
    }

    println("\n------store iteration value in a for loop")

    val iteration_value = for {ii <- 0 to 3; j <- 0 to 5} yield ii
    for (i <- iteration_value){
      println(i)}

    println("\nsecond flavor")
    val iteration_value2 = for {ii <- 0 to 3; j <- 0 to 5} yield j
    for (i <- iteration_value2){
      println(i)}

    println("\nthird flavor")
    val iteration_value3 = for {i <- list_data if i>50; if i!=52} yield i
    for (i <- iteration_value3){
      println(i)}





  }


}

//reference:
// https://www.tutorialspoint.com/scala/scala_for_loop.htm
