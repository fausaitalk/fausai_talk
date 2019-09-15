package com.gavin.talk03

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-15 11:42
  * Description: TODO
  */
object Demo06 {
  def main(args: Array[String]): Unit = {
    //   i 表示循环的变量， <- 表示赋值给 i
    //   1 to 10表示从1到10循环，前闭后闭
    for (i <- 1 to 10) {
      println(i)
    }
    //   1 until 100表示从1到10循环，前闭后开
    for (i <- 1 until 10) {
      println(i)
    }
  }
}
