package com.gavin.talk03

import scala.io.StdIn

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-14 17:31
  * Description: TODO
  */
object Demo04 {
  def main(args: Array[String]): Unit = {
    print("请输入分数：")
    val grade = StdIn.readInt()
    if (grade >= 90) {
      println("优秀")
    } else if (grade >= 80 && grade < 90) {
      println("良好")
    } else if (grade >= 70 && grade < 80) {
      println("良好")
    } else if (grade >= 60 && grade < 70) {
      println("一般")
    } else {
      println("补考")
    }
  }
}
