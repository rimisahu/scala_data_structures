package algorithms.sorting_algorithms

object selection extends App{


    /*
    * Take index 0 as pivot
    * Find the min vaule in array compated to pivot  
    * Swap min value with pivot
    * Move pivot counter to 1 
    * Find min after that Swap
    * Rinse <-> Repeat
    *
    * TIME COMPLEXITY
    * best case : (n-1)(n-2)(n-3)...(1) = O(n^2)
    * average case : (n-1)(n-2)(n-3)...(1) = O(n^2)
    * worst case : (n-1)(n-2)(n-3)...(1) = O(n^2)
    *
    * */

    val testset_01 = Array(4,5,6,7,1,2,3)
    println("\ninput string -->[testset_01] output string -->")
    val result01=run_selection(testset_01)
    result01.foreach(println)

  val testset_02 = Array(234, 7, 24, 32)
  println("\ninput string -->[testset_02] output string -->")
  val result02=run_selection(testset_02)
  result02.foreach(println)

  val testset_03 = Array(1)
  println("\ninput string -->[testset_03] output string -->")
  val result03=run_selection(testset_03)
  result03.foreach(println)

    def run_selection(Arr: Array[Int]): Array[Int] ={

      var final_arr=Arr
      val arr_size=final_arr.size

      for (i <- 0 to arr_size-1){
        var pivot=i
        for (j <- i+1 to arr_size-1){
          if (final_arr(pivot)>final_arr(j)){
            pivot=j
          }
        }
        final_arr=swap(final_arr,i,pivot)
      }

      final_arr
    }

    def swap(inputArray:Array[Int],left_index:Int,right_index:Int): Array[Int] ={
      val temp=inputArray(left_index)
      inputArray(left_index)=inputArray(right_index)
      inputArray(right_index)=temp
      inputArray
    }


}
