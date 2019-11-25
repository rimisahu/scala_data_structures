package scala_study

object test {

  def main(args: Array[String]): Unit = {

    val arr = Array.ofDim[Int](6, 6)

    for (i <- 0 until 6) {
      arr(i) = scala.io.StdIn.readLine.split(" ").map(_.trim.toInt)
    }

//    for (arr_line <- arr){
//
//      println(arr_line)
//      println(arr_line(0))
//    }


    var max_val=(999)*(-1)


    for (i <- 0 to 3) {

      for (j <- 0 to 3){
        val iteration_sum = arr(i)(j) + arr(i)(j + 1) + arr(i)(j + 2)
              + arr(i + 1)(j + 1)
              + arr(i + 2)(j) + arr(i + 2)(j + 1) + arr(i + 2)(j + 2)

            println("iteration "+ i)
            println(iteration_sum)
            println("first, last element: " + arr(i)(j) +"   "+arr(i + 2)(j + 2))

        if (max_val<iteration_sum){max_val=iteration_sum}

      }

    }

    println("max value is: "+ max_val)


//    val iteration_sum = arr(i)(i) + arr(i)(i + 1) + arr(i)(i + 2) + arr(i + 1)(i + 1) + arr(i + 2)(i) + arr(i + 2)(i + 1) + arr(i + 2)(i + 2)
//
//    println("iteration "+ i)
//    println(iteration_sum)
//    println("first, last element: " + arr(i)(i) +"   "+arr(i + 2)(i + 2))


  }

}
