package com.gavin.scala.talk04

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-21 16:36
  * Description: TODO
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    println(abs)
    println(abs(2))
  }
  val abs: Double => Double = (x: Double) => if (x > 0) x else -x
}
