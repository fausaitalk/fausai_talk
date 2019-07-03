package com.gavin.talk01

/**
  * Created with IntelliJ IDEA.
  * Project:fausai_talk
  * Author: gavin
  * Date: 2019-07-03 21:52
  * Description: TODO
  */
object Demo06 {
  def main(args: Array[String]): Unit = {

    val r = returnUnit() //调用returnUnit方法，没有参数传递，可以简写为returnUnit
    println(s"returnUnit方法返回：$r")

    var b: Baby = null // b 是引用类型
    //var c: Char = null //错误 [Int， Float，Char等等都不行]

    returnNothing
  }

  def returnUnit(): Unit = {
    println("没返回值，只是打印")
  }

  def returnNothing(): Nothing = {
    throw new Exception("异常抛出")
  }
}

class Baby {}