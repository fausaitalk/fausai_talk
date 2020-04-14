package com.gavin.scala.talk02

/**
  * @Author: Gavin
  * @Date: 2019/7/10 18:05
  */
object Demo02 {
  def main(args: Array[String]): Unit = {


    val str = "hello"
    val res1 = str + " world"
    val res2 = str + 123
    println(s"res1:$res1")
    println(s"res2:$res2")


    var a = 3
    //a++ //报错，没有该语法
    a += 1
    println(s"s:$a")


  }
}
