package com.gavin.scala.talk03



/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-15 11:42
  * Description: TODO
  */
object Demo11 {

  def main(args: Array[String]): Unit = {
    val age = 18
    var count = 0
    //使用前需要引入包
    import util.control.Breaks._
    breakable {
      while (age >= 16) {
        println("满足条件，可以玩游戏")
        count += 1
        if (count == 10) {
          println("休息一下")
          break() //跳出循环
        }
      }
    }
  }

}