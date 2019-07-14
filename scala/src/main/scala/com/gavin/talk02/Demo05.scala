package com.gavin.talk02

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-07-14 15:54
  * Description: TODO
  */
object Demo05 {
  def main(args: Array[String]): Unit = {
    val a = true
    val b = false
    println("a && b = " + (a && b))  // false
    println("a || b = " + (a || b)) // true
    println("!(a && b) = " + !(a && b)) // true
  }
}
