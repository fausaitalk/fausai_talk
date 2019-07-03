package com.gavin.talk01

/**
  * @Author: Gavin
  * @Date: 2019/7/2 11:28
  */
object Demo02 {
  def main(args: Array[String]): Unit = {

    val num1 = 666 // 默认num1为Int类型
    val num2 = 18L // 加上L指定num2为Long类型

    val intMax = Int.MaxValue
    val MinValue = Int.MinValue

    //val num3 = 21474836470 // 超出了Int范围，报错

    println(s"Int类型最大值为：$intMax，最小值为：$MinValue")

  }
}
