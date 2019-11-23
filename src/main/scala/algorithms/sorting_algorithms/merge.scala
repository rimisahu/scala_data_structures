package algorithms.sorting_algorithms

object merge {

  /*
  *
  *
  *
  * TIME COMPLEXITY
    * best case : (n-1)(n-2)(n-3)...(1) = O(n^2)
    * average case : (n-1)(n-2)(n-3)...(1) = O(n^2)
    * worst case : (n-1)(n-2)(n-3)...(1) = O(n^2)
   *
   */



  val testset_01 = Array(4, 5, 6, 7, 1, 2, 3)
  println("\ninput string -->[testset_01] output string -->")
  val result01 = run_selection_sort(testset_01)
  result01.foreach(println)

  val testset_02 = Array(234, 7, 24, 32)
  println("\ninput string -->[testset_02] output string -->")
  val result02 = run_selection_sort(testset_02)
  result02.foreach(println)

  val testset_03 = Array(1)
  println("\ninput string -->[testset_03] output string -->")
  val result03 = run_selection_sort(testset_03)
  result03.foreach(println)


  def run_selection_sort(Arr: Array[Int]): Array[Int] = {


    Arr


  }

}
