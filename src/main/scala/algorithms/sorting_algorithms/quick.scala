package algorithms.sorting_algorithms

import utils.common_functions

object quick extends App{

  /*
  * divide and conquer mechanism sort of
  * find pivot
  * reorganize array - all elements <pivot to the left of pivot, elements >pivot move to right of pivot
  * after the final iteration, swap the pivot with the last element index+1 that is < pivot index data
  *
  *
  * ASSUMPTIONS
  * -
  *
  * TIME COMPLEXITY
    * best case : O(n*log(n))
    * average case : O(n*log(n))
    * worst case : O(n*log(n))
   *
   */



  val testset_01 = Array(4, 5, 6, 7, 1, 2, 3)
  println("\ninput string -->[testset_01] output string -->")
  val result01 = run_quick_sort(testset_01,0,6)
  result01.foreach(println)

//  val testset_02 = Array(234, 7, 24, 32)
//  println("\ninput string -->[testset_02] output string -->")
//  val result02 = run_quick_sort(testset_02,0,3)
//  result02.foreach(println)
//
//  val testset_03 = Array(1)
//  println("\ninput string -->[testset_03] output string -->")
//  val result03 = run_quick_sort(testset_03,0,0)
//  result03.foreach(println)


  val testset_11 = Array(4, 5, 6, 7, 1, 2, 3)
  println("\ninput string -->[testset_11] output string -->")
  val result11 = arr_partition(testset_11,0,3)
  println(result11)

  val testset_12 = Array(234, 7, 24, 32)
  println("\ninput string -->[testset_12] output string -->")
  val result12 = arr_partition(testset_12,0,2)
  println(result12)


  def run_quick_sort(Arr: Array[Int],start: Int, end: Int): Array[Int] = {

    while (start < end){

      val partition_index= arr_partition(Arr,start,end)
      run_quick_sort(Arr,start,partition_index)
      run_quick_sort(Arr,partition_index,end)


      }


    Arr
  }

  def arr_partition(Arr: Array[Int],start: Int, end: Int): Int ={

    var Arr_temp = Arr
    var pivot=Arr_temp(end)
    var p_index=start

    println("----")
    println(start)
    println(end)
    for (i <- start to end){
      if (Arr_temp(i) < pivot){
        Arr_temp = common_functions.swap(Arr_temp,i,p_index)
        p_index=p_index+1

      }
    }
    common_functions.swap(Arr_temp,end,p_index)

    p_index
  }



}
