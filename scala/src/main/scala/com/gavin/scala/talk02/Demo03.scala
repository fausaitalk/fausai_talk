package com.gavin.scala.talk02

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-07-14 15:06
  * Description: TODO
  */
object Demo03 {

  def main(args: Array[String]) {
    var a = 10
    var b = 20
    var c = 30
    var d = 15
    var e = 50
    val num = a +b
    println(s"num = $num")
    a <<= 2
    println("左移:" + a)
    b >>= 2
    println("右移:" + b)
    c &= 2
    println("位与后赋值:" + c)
    d &= 2
    println("位异或后赋值:" + d)
    e &= 2
    println("位异或后赋值:" + e)

  }

}
