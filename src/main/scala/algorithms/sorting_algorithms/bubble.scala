package algorithms.sorting_algorithms

object bubble extends App{

  /*
*iterate over given array
* swap each time a[i]>a[i+1]
* keep swapping until the iteration doesnt have a swap
 */

  val testset_01 = Array(4, 5, 6, 7,1, 2, 3)
  println("\ninput string -->[testset_01] output string -->")
  val result01=array_sort_bubble(testset_01)
  result01.foreach(println)

  val testset_02 = Array(234, 7, 24, 32)
  println("\ninput string -->[testset_02] output string -->")
  val result02=array_sort_bubble(testset_02)
  result02.foreach(println)

  val testset_03 = Array(1)
  println("\ninput string -->[testset_03] output string -->")
  val result03=array_sort_bubble(testset_03)
  result03.foreach(println)


  def array_sort_bubble(Arr: Array[Int]): Array[Int] ={

    var swap_flag=true
    val arr_length=Arr.size

    while (swap_flag){
      swap_flag=false

      for (i <- 0 to arr_length-2){
        if (Arr(i)>Arr(i+1)){
          val temp=Arr(i)
          Arr(i)=Arr(i+1)
          Arr(i+1)=temp
          swap_flag=true
        }

      }
    }

    Arr

  }

}
