package data_structures.cracking_the_coding_interview

object string_1_2 extends App{

  /*
  1.2
    - implement a function void reverse(char*str) which reverses a null-terminated string
   */

  //in place reverse

  //recursion
    // edge case:
      //if string size = 2, reverse the chars and send back
      //if string is 1 char, return the char
      // function is going to inupt string

  val testset_01 = "abcdefg"
  println("input string -->[" +testset_01+"] output string  [\t"+ reverse_string(testset_01))

  println("----")

  def reverse_string(string_val: String): String ={

    println("=========input string======: ")

    val string_size=string_val.length
    println("string size "+string_size)
    //edge case 1
    if (string_size==1){
      println("size 1: "+string_val)
      return string_val
    }
    if (string_size==2){
      println("size 2: "+string_val.slice(1,2)+string_val.slice(0,1))

      return string_val.slice(1,2)+string_val.slice(0,1)
    }
    val left_index=0
    val mid_index=string_size/2
    val right_index=string_size

    println("lengths : ["+left_index+"] ["+mid_index+"] ["+right_index+"]")

    val left_string=reverse_string(string_val.slice(left_index,mid_index))
    val right_string=reverse_string(string_val.slice(mid_index,right_index))

    println("left string: "+left_string)
    println("right string: "+right_string)

    println("===>>>>>>==")

    right_string+left_string
  }

}
