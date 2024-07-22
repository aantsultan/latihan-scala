package com.latihan.scala.google.guice.di.config

import com.google.inject.Singleton
import org.apache.spark.sql.SparkSession

@Singleton
class SparkConfig {

  def createSparkSession(appName: String, isLocal: Boolean): SparkSession = {
    if(isLocal){
      SparkSession
        .builder()
        .config("spark.sql.caseSensitive", value = true)
        .config("spark.sql.session.timeZone", value = "UTC")
        .config("spark.driver.memory", value = "1G")
        .appName("appName")
        .master("local[*]")
        .getOrCreate()
    } else {
      SparkSession
        .builder()
        .config("spark.sql.caseSensitive", value = true)
        .config("park.sql.session.timeZone", value = "UTC")
        .appName(appName)
        .getOrCreate()
    }
  }

}
