package com.gavin.talk03

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-15 11:42
  * Description: TODO
  */
object Demo08 {
  //通过yield关键字返回10以内的偶数组成的结合
  def main(args: Array[String]): Unit = {
    val arr = for (i <- 1 to 10 if i % 2 == 0) yield i
    println(arr)
    //Vector(2, 4, 6, 8, 10)
  }
}
