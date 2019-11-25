package utils

object common_functions {

  def swap(inputArray:Array[Int],left_index:Int,right_index:Int): Array[Int] = {
    val temp = inputArray(left_index)
    inputArray(left_index) = inputArray(right_index)
    inputArray(right_index) = temp
    inputArray

  }

}
