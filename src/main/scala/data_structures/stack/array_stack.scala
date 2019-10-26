package data_structures.stack

object array_stack extends App{

  /* basic functions to implement
  1. is empty/null : check_empty
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

  val test1=check_empty(test_arr1)
  println(test1)
  val test2=check_empty(test_arr2)
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


  def check_empty(arr: Array[Int]): Boolean ={
    //true if array is empty
    //else false
    arr.isEmpty
  }

  def push(arr: Array[Int], push_val: Int): Array[Int] ={
    val new_arr=Array(push_val)
    new_arr++arr
  }

  def pop (arr: Array[Int]): Array[Int] ={

    var arr_new=Array.empty[Int]

    if (!check_empty(arr)){
      val arr_length=arr.length
      arr_new = arr.slice(1,arr_length-1)
    } else arr_new=arr
    arr_new
  }

  //--------------other reference

  //reference: https://www.techiedelight.com/stack-implementation-in-java/
  //classtag info: https://docs.scala-lang.org/overviews/reflection/typetags-manifests.html  ; https://dzone.com/articles/scala-classtag-a-simple-use-case
  //https://stackoverflow.com/questions/12218641/scala-what-is-a-typetag-and-how-do-i-use-it
  //queue java: https://www.programcreek.com/2014/07/implement-a-queue-using-an-array-in-java/


//
//  class Stack(var capacity: Int) // Constructor to initialize stack
//  {
//    arr = new Array[Int](capacity)
//    top = -1
//    private var arr = null
//    private var top = 0
//
//    // Utility function to add an element x in the stack
//    def push(x: Int): Unit = {
//      if (isFull) {
//        System.out.println("OverFlow\nProgram Terminated\n")
//        System.exit(1)
//      }
//      System.out.println("Inserting " + x)
//      arr({
//        top += 1; top
//      }) = x
//    }
//
//    // Utility function to pop top element from the stack
//    def pop: Int = { // check for stack underflow
//      if (isEmpty) {
//        System.out.println("UnderFlow\nProgram Terminated")
//        System.exit(1)
//      }
//      System.out.println("Removing " + peek)
//      // decrease stack size by 1 and (optionally) return the popped element
//      arr({
//        top -= 1; top + 1
//      })
//    }
//
//    // Utility function to return top element in a stack
//    def peek: Int = {
//      if (!isEmpty) return arr(top)
//      else System.exit(1)
//      -1
//    }
//
//    // Utility function to return the size of the stack
//    def size: Int = top + 1
//
//    // Utility function to check if the stack is empty or not
//    def isEmpty: Boolean = top == -1 // or return size() == 0;
//
//    // Utility function to check if the stack is full or not
//    def isFull: Boolean = top == capacity - 1 // or return size() == capacity;
//  }

}
