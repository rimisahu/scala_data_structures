package data_structures.cracking_the_coding_interview

object string_1_1 extends App {


  /*
  1.1
    - Implement an algorithm to determine if a string has all unique characters.
    - What if you cannot use additional data structures?
   */

  /*
  1.  iterate over the string
    2. check if character matches the rest of the string
    3. if it does then return false
  4. print out where there is a duplicate match
   */

  val testset_01 = "jjlsocn"
  println("string -->" +testset_01+" is unique? \t"+ is_string_unique(testset_01))

  val testset_02 = "qwerty"
  println("string -->" +testset_02+" is unique? \t"+ is_string_unique(testset_02))

  val testset_03 = "msu290dn"
  println("string -->" +testset_03+" is unique? \t"+ is_string_unique(testset_03))

  val testset_04 = ""
  println("string -->" +testset_04+" is unique? \t"+ is_string_unique(testset_04))

  val testset_05 = "~.>asdf"
  println("string -->" +testset_05+" is unique? \t"+ is_string_unique(testset_05))

  def is_string_unique(string_val: String): Boolean ={

    var substring_val=string_val

    string_val.foreach{char_val =>
      substring_val = substring_val.drop(1)

      substring_val.foreach{ substing_char_val =>
        if (char_val==substing_char_val){
          println("characters that match"+char_val)
          return false
        }
      }
    }
    true

  }
}
