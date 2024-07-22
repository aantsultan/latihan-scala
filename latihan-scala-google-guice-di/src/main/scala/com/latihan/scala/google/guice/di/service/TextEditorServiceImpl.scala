package com.latihan.scala.google.guice.di.service

import com.google.inject.Inject

class TextEditorServiceImpl @Inject()(spellCheckerService: SpellCheckerService) extends TextEditorService
{
  override def makeSpellCheck(): Unit = {
    spellCheckerService.checkSpelling("Aant")
  }
}
