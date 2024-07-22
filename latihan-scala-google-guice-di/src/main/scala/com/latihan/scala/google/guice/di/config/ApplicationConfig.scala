package com.latihan.scala.google.guice.di.config

import com.typesafe.config.ConfigFactory

object ApplicationConfig {

  private val config = ConfigFactory.load("application.properties")

  val basePath: String = config.getString("base.path.data")

}
