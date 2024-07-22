package com.latihan.scala.google.guice.di

import com.google.inject.{Guice, Injector}
import com.latihan.scala.google.guice.di.module.ApplicationModule
import com.latihan.scala.google.guice.di.service.UserService

object ScalaGoogleGuiceDiMain {

  def main (args:Array[String]): Unit = {
    val injector : Injector = Guice.createInjector(new ApplicationModule())
    val user : UserService = injector.getInstance(classOf[UserService])
    user.getData()
  }

}
