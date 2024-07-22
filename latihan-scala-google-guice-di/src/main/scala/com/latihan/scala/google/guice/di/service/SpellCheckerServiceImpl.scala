package com.latihan.scala.google.guice.di.service

class SpellCheckerServiceImpl extends SpellCheckerService
{
  override def checkSpelling(data: String): String = {
    val hello : String = s"Hello $data"
    println(hello)
    hello
  }
}
