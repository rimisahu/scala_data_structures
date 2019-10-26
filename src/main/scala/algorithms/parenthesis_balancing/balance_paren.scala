package algorithms.parenthesis_balancing

import scala.collection.mutable.Stack

object balance_paren extends App {

  //basic implementation

  /* pseduocode
  1. read string, iterate over it
  2. check for open parenthesis.
  3. if there is open parenthesis, push to stack
  4.if there is closed parenthesis matching, pop from stack
  5. at the end of string the stack is empty, close it
  6.
   */

  val testset_01 = "[[([)[{}]]]]"
  println("string -->" +testset_01+" is balanced? \t"+ check_paren_balance(testset_01))

  val testset_02 = "({}{[][]})"
  println("string -->" +testset_02+" is balanced? \t"+ check_paren_balance(testset_02))

  val testset_03 = "({[]})"
  println("string -->" +testset_03+" is balanced? \t"+ check_paren_balance(testset_03))

  val testset_04 = "(]})"
  println("string -->" +testset_04+" is balanced? \t"+ check_paren_balance(testset_04))

  val testset_05 = "(]"
  println("string -->" +testset_05+" is balanced? \t"+ check_paren_balance(testset_05))

  val testset_06 = "taxi {woo}! [hoo]!"
  println("string -->" +testset_06+" is balanced? \t"+ check_paren_balance(testset_06))

  val testset_07 = "]["
  println("string -->" +testset_07+" is balanced? \t"+ check_paren_balance(testset_07))

  val testset_08 = ""
  println("string -->" +testset_08+" is balanced? \t"+ check_paren_balance(testset_08))

  val testset_09 = "()()()()()(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))"
  println("string -->" +testset_09+" is balanced? \t"+ check_paren_balance(testset_09))

  def check_paren_balance(input_string: String): Boolean ={

    var paren_stack = Stack[String]()
    var balanced_flag=false

    input_string.foreach { substing_val =>
            if (substing_val=='(' || substing_val=='[' || substing_val=='{'){
              paren_stack.push(substing_val.toString)
            } else if (substing_val==')' || substing_val==']' || substing_val=='}'){

              if (paren_stack.isEmpty) return false
              val top_stack_value=paren_stack.top
              val substr_val=substing_val.toString

              if ( substr_val == "}" && top_stack_value=="{"){
                paren_stack.pop()
              } else if (substr_val == ")" && top_stack_value=="("){
                paren_stack.pop()
              } else if (substr_val == "]" && top_stack_value=="["){
                paren_stack.pop()
              } else return false
            }
    }

    if (paren_stack.isEmpty){
      balanced_flag=true
    }
    balanced_flag
  }

}
