/*
 * This Scala source file was generated by the Gradle 'init' task.
 */
package com.latihan.scala.utilities

import com.latihan.scala.list.LinkedList

object JoinUtils {
    def join(source: LinkedList): String = {
        val result = new StringBuilder()
        var i = 0;
        while (i < source.size() ) {
            if (result.length() > 0) {
                result.append(" ")
            }
            result.append(source.get(i))
            i = i +1
        }

        result.toString()
    }
}