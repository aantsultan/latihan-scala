package com.latihan.common.config

import com.google.inject.{Inject, Singleton}
import com.latihan.common.util.CommonUtil

@Singleton
class ServiceConfig @Inject()(
                               val commonUtil: CommonUtil
                             ) {

  def getHelloWorld: Unit = {
    val helloWorld: String = commonUtil.helloWorld;
  }
}
