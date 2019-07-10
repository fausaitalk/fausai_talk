package com.gavin.talk02

/**
  * @Author: Gavin
  * @Date: 2019/7/10 17:45
  */
object Demo01 {

  def main(args: Array[String]): Unit = {

    val r1: Int = 25 + 5 //两个整数相加
    println("r1=" + r1)
    val r2: Int = 25 - 5 //两个整数相减
    println("r2=" + r2)
    val r3: Int = 3 * 5 //两个整数相乘
    println("r3=" + r3)
    val r4: Double = 25 / 5 //两个整数相除
    println("r4=" + r4)
    val r5: Double = 25 / 3 //两个整数相除，保留两位小数,使用四舍五入
    println("r5=" + r5.formatted("%.2f")) //
    val r6: Double = 26.88 / 3.1 //两个小数相除，保留两位小数,使用四舍五入
    println("r6=" + r6.formatted("%.2f")) //
    val r7: Int = 25 % 3 //取模，即取余数
    println("r7=" + r7)//


  }
}
