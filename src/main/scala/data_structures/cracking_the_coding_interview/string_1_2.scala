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
      //if string is empty
    //function is going to input string


  val testset_01 = "abcdefg"
  println("\ninput string -->[" +testset_01+"] output string -->"+ reverse_string(testset_01))

  val testset_02 = "ab"
  println("\ninput string -->[" +testset_02+"] output string -->"+ reverse_string(testset_02))

  val testset_03 = "a"
  println("\ninput string -->[" +testset_03+"] output string -->"+ reverse_string(testset_03))

  val testset_04 = ""
  println("\ninput string -->[" +testset_04+"] output string -->"+ reverse_string(testset_04))

  val testset_05 = "asdf;jk23r90sa()#$*"
  println("\ninput string -->[" +testset_05+"] output string -->"+ reverse_string(testset_05))



  println("----")

  def reverse_string(string_val: String): String ={
    val string_size=string_val.length
    //edge case 1

    if (string_size==0 || string_val==null){
      return string_val
    }
    if (string_size==1){
      return string_val
    }
    if (string_size==2){
      return string_val.slice(1,2)+string_val.slice(0,1)
    }
    val left_index=0
    val mid_index=string_size/2
    val right_index=string_size

    val left_string=reverse_string(string_val.slice(left_index,mid_index))
    val right_string=reverse_string(string_val.slice(mid_index,right_index))

    right_string+left_string
  }

}
