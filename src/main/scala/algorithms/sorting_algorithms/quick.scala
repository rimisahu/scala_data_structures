package algorithms.sorting_algorithms

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
  val result01 = run_quick_sort(testset_01)
  result01.foreach(println)

  val testset_02 = Array(234, 7, 24, 32)
  println("\ninput string -->[testset_02] output string -->")
  val result02 = run_quick_sort(testset_02)
  result02.foreach(println)

  val testset_03 = Array(1)
  println("\ninput string -->[testset_03] output string -->")
  val result03 = run_quick_sort(testset_03)
  result03.foreach(println)

//
//  val testset_11 = Array(4, 5, 6, 7, 1, 2, 3)
//  val testset_11_l=Array(1, 2, 3, 4)
//  val testset_11_r=Array(5, 6, 7)
//  println("\ninput string -->[testset_11] output string -->")
//  val result11 = arr_partition(testset_11_l,testset_11_r,testset_11)
//  result11.foreach(println)
//
//  val testset_12 = Array(234, 7, 24, 32)
//  val testset_12_l = Array(7)
//  val testset_12_r = Array(24, 32,234)
//  println("\ninput string -->[testset_12] output string -->")
//  val result12 = arr_partition(testset_12_l,testset_12_r,testset_12)
//  result12.foreach(println)


  def run_quick_sort(Arr: Array[Int]): Array[Int] = {

    Arr
  }

  def arr_partition(left: Int, right: Int, Arr: Array[Int]): Array[Int] ={


    Arr

  }



}
