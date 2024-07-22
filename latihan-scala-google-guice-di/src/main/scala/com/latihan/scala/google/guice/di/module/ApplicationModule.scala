package com.latihan.scala.google.guice.di.module

import com.google.inject.AbstractModule
import com.latihan.scala.google.guice.di.service._

class ApplicationModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[SpellCheckerService]).to(classOf[SpellCheckerServiceImpl])
    bind(classOf[TextEditorService]).to(classOf[TextEditorServiceImpl])
    bind(classOf[UserService]).to(classOf[UserServiceImpl])
  }
}
