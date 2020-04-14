package com.gavin.scala.talk01

/**
  * @Author: Gavin
  * @Date: 2019/7/2 11:16
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    //var name: String //无初始值，报错
    var name: String = "Gavin" //名字
    val gender: String = "男" //性别
    var age: Int = 18 //年龄

    //var name = "Gavin" //名字
    //val gender = "男" //性别
    //var age = 18 //年龄


    //gender = "女" //报错，因为val不可变
    age = 19 //age的值可以更改

    println(s"姓名：$name, 性别：$gender, 年龄：$age") //格式化输出
  }
}
