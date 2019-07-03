package com.gavin.talk01

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-07-03 21:24
  * Description: TODO
  */
object Demo04 {

  def main(args: Array[String]): Unit = {

    val a1: Char = 'a'
    val a2: Char = '\t'
    val a3: Char = '牛'
    val a4: Char = 97

    println(s"a1:$a1")
    println(s"a2:$a2")
    println(s"a3:$a3")
    println(s"a4:$a4") // 大于 97对应的ASCII码 (Unicode字符集包括了ascii码)


    val b1: Char = '\\'
    val b2: Char = '\t'
    val b3: Char = '\''
    val b4: Char = '\"'

    println(s"b1:$b1")
    println(s"b2:$b2")
    println(s"b3:$b3")
    println(s"b4:$b4")

    val c1: Char = '爱'
    val c2: Int = c1.toInt
    val c3: Char = 39547 //直接给c4一个码值，默认输出对应的字符
    println(s"c1:$c1 ,爱对应的码值: $c2")
    println(s"c3:$c3")

  }

}
