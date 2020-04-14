package com.gavin.scala.talk03

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-09-15 11:42
  * Description: TODO
  */
object Demo12 {

  def main(args: Array[String]): Unit = {
    //使用前需要引入包
    import util.control.Breaks._
    var count = 0
    breakable {
      do {
        if (count == 12) {
          break()
        }
        count += 1
        println("先交房租")
      } while (true) //是否续租
    }
  }

}