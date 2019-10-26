package algorithms.parenthesis_balancing

import scala.collection.mutable.Stack

object balance_paren extends App {

  /* pseduocode
  1. read string, iterate over it
  2. check for open parenthesis.
  3. if there is open parenthesis, push to stack
  4.if there is closed parenthesis matching, pop from stack
  5. at the end of string the stack is empty, close it
  6.
   */

  val testset_01 = "[[([)[{}]]]]"
  println("testset_01 is balanced? "+ check_paren_balance(testset_01))

  val testset_02 = "({}{[][]})"
  println("testset_02 is balanced? "+ check_paren_balance(testset_02))


  def check_paren_balance(input_string: String): Boolean ={

    val input_length=input_string.size

    println("string size: "+ input_length)

    var paren_stack = Stack[String]()
    var balanced_flag=false

    input_string.foreach { substing_val =>
      println(substing_val)
            if (substing_val=='(' || substing_val=='[' || substing_val=='{'){
              paren_stack.push(substing_val.toString)
              println("pushing: "+substing_val)
            } else if (substing_val==')' || substing_val==']' || substing_val=='}'){
              val top_stack_value=paren_stack.top
              val substr_val=substing_val.toString

              println("strings---: "+top_stack_value+" "+substr_val)

              if ( substr_val == "}" && top_stack_value=="{"){
                println("popping: "+substing_val)
                paren_stack.pop()
              } else if (substr_val == ")" && top_stack_value=="("){
                println("popping: "+substing_val)
                paren_stack.pop()
              } else if (substr_val == "]" && top_stack_value=="["){
                println("popping: "+substing_val)
                paren_stack.pop()
              }
            }
    }

    if (paren_stack.isEmpty){
      balanced_flag=true
      println("string is balanced!")
    }

    balanced_flag

  }



}
