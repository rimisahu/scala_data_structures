package algorithms.sorting_algorithms

object merge extends App{

  /*
  *
  *
  * ASSUMPTIONS
  * - For the merge function to work, the left and right arrays should have atleast one value
  *
  *
  * TIME COMPLEXITY
    * best case : (n-1)(n-2)(n-3)...(1) = O(n^2)
    * average case : (n-1)(n-2)(n-3)...(1) = O(n^2)
    * worst case : (n-1)(n-2)(n-3)...(1) = O(n^2)
   *
   */



//  val testset_01 = Array(4, 5, 6, 7, 1, 2, 3)
//  println("\ninput string -->[testset_01] output string -->")
//  val result01 = run_merge_sort(testset_01)
//  result01.foreach(println)
//
//  val testset_02 = Array(234, 7, 24, 32)
//  println("\ninput string -->[testset_02] output string -->")
//  val result02 = run_merge_sort(testset_02)
//  result02.foreach(println)
//
//  val testset_03 = Array(1)
//  println("\ninput string -->[testset_03] output string -->")
//  val result03 = run_merge_sort(testset_03)
//  result03.foreach(println)


  val testset_11 = Array(4, 5, 6, 7, 1, 2, 3)
  val testset_11_l=Array(1, 2, 3, 4)
  val testset_11_r=Array(5, 6, 7)
  println("\ninput string -->[testset_11] output string -->")
  val result01 = merge(testset_11_l,testset_11_r,testset_11)
  result01.foreach(println)

  val testset_12 = Array(234, 7, 24, 32)
  val testset_12_l = Array(7)
  val testset_12_r = Array(24, 32,234)
  println("\ninput string -->[testset_12] output string -->")
  val result02 = merge(testset_12_l,testset_12_r,testset_12)
  result02.foreach(println)




  def run_merge_sort(Arr: Array[Int]): Array[Int] = {


    Arr


  }

  def merge(left_arr: Array[Int], right_arr: Array[Int], arr: Array[Int]): Array[Int] ={

    var k=0
    var l=0
    var r=0
    val len_r=right_arr.size
    val len_l=left_arr.size

    while(l<len_l && r<len_r){

      if (left_arr(l) <= right_arr(r)){
        arr(k)=left_arr(l)
        k=k+1
        l=l+1
      } else {
        arr(k)=right_arr(r)
        k=k+1
        r=r+1
      }
    }

    while (l<len_l){
      arr(k)=left_arr(l)
      k=k+1
      l=l+1
    }

    while(r<len_r){
      arr(k)=right_arr(r)
      k=k+1
      r=r+1
    }

    arr

  }

}
