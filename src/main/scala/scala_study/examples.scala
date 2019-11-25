package scala_study

object examples {

  def main(args: Array[String]): Unit = {

    //how to get user input and print it out
    run_user_input_func


  }

  def run_user_input_func(): Unit ={
    //how to get user input
    println("please enter a value to try")
    val user_input = scala.io.StdIn.readLine()
    println("user entered: ")
    println(user_input)
  }

}
