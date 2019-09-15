package com.gavin.talk03

import scala.io.StdIn

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-14 17:31
  * Description: TODO
  */
object Demo05 {
  def main(args: Array[String]): Unit = {
    print("请输入季节（旺季or淡季）：")
    val season = StdIn.readLine()
    print("请输入年龄：")
    val age = StdIn.readInt()
    if ("旺季" == season) {
      if (age < 16) {
        println("旺季孩子收费40￥")
      } else {
        println("旺季大人收费50￥")
      }
    } else {
      if (age < 16) {
        println("淡季孩子收费20￥")
      } else {
        println("淡季大人收费30￥")
      }
    }
  }
}
