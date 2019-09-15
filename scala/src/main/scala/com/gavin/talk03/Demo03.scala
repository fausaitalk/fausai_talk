package com.gavin.talk03

import scala.io.StdIn

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-14 17:31
  * Description: TODO
  */
object Demo03 {
  def main(args: Array[String]): Unit = {
    print("请输入年龄：")
    val age = StdIn.readInt()
    if (age >= 16) {
      println("可以玩游戏啦")
    } else {
      println("小孩子去做作业")
    }
  }
}
