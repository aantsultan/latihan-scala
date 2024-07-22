package com.latihan.scala.google.guice.di.service

import com.latihan.scala.google.guice.di.config.{ApplicationConfig, SparkConfig}

import javax.inject.Inject


class UserServiceImpl @Inject()(sparkConfig: SparkConfig) extends UserService {
  override def getData(): Unit = {
    val spark = sparkConfig.createSparkSession(appName = "user_app", isLocal = true)
    val data = spark
      .read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv(s"${ApplicationConfig.basePath}/user/user_data.csv")
    println(data)
  }
}