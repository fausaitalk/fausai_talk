package com.gavin.talk03

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-15 11:42
  * Description: TODO
  */
object Demo07 {
  def main(args: Array[String]): Unit = {
    //守卫
    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }
    //引入变量，需要分号
    for (i <- 1 to 10; j = i + 1) {
      println(i)
    }
  }
}
