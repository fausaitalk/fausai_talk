package com.gavin.scala.talk03

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-15 11:42
  * Description: TODO
  */
object Demo09 {
  def main(args: Array[String]): Unit = {
    println("第一种写法")
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(j + "*" + i + "=" + j * i + " ")
        if (j == i) println()
      }
    }
    println("第二种写法")
    for (i <- 1 to 9; j <- 1 to i) {
      print(j + "*" + i + "=" + j * i + " ")
      if (j == i) println()
    }
  }

}