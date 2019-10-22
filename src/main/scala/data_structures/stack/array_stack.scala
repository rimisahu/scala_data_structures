package data_structures.stack

object array_stack extends App{

  /* basic functions to implement
  1. is empty/null : check_status
  2. push : push
  3. pop :  pop
  4. does it exist? - pending
  5. length of stack - pending
  */


  /* pseudocode steps
  1.
  */

  var test_arr1 = Array(1, 2, 3, 4, 5, 6, 7)
  val test_arr2=Array.empty[Int]
  var test_arr3 = Array(7)

  val test1=check_status(test_arr1)
  println(test1)
  val test2=check_status(test_arr2)
  println(test2)

  val test3=push(test_arr1,3)
  println("test3 ...")
  test3.foreach(println)
  val test4=push(test_arr2,3)
  println("test4 ...")
  test4.foreach(println)

  val test5=pop(test_arr1)
  println("test5 ...")
  test5.foreach(println)
  val test6=pop(test_arr2)
  println("test6 ...")
  test6.foreach(println)
  val test7=pop(test_arr3)
  println("test7 ...")
  test7.foreach(println)




  def check_status(arr: Array[Int]): Boolean ={
    arr.isEmpty
    //true if array is empty
    //else false
  }

  def push(arr: Array[Int], push_val: Int): Array[Int] ={
    val new_arr=Array(push_val)
    new_arr++arr
  }

  def pop (arr: Array[Int]): Array[Int] ={

    var arr_new=Array.empty[Int]

    if (!check_status(arr)){
      val arr_length=arr.length
      arr_new = arr.slice(1,arr_length-1)

    } else arr_new=arr

    arr_new

  }


}
