/*
 * This Scala source file was generated by the Gradle "init" task.
 */
package com.latihan.scala.list

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions._

class LinkedListTest {
    @Test def testConstructor(): Unit = {
        val list = new LinkedList()
        assertEquals(0, list.size())
    }

    @Test def testAdd(): Unit = {
        val list = new LinkedList()

        list.add("one")
        assertEquals(1, list.size())
        assertEquals("one", list.get(0))

        list.add("two")
        assertEquals(2, list.size())
        assertEquals("two", list.get(1))
    }

    @Test def testRemove(): Unit = {
        val list = new LinkedList()

        list.add("one")
        list.add("two")
        assertTrue(list.remove("one"))

        assertEquals(1, list.size())
        assertEquals("two", list.get(0))

        assertTrue(list.remove("two"))
        assertEquals(0, list.size())
    }

    @Test def testRemoveMissing(): Unit = {
        val list = new LinkedList()

        list.add("one")
        list.add("two")
        assertFalse(list.remove("three"))
        assertEquals(2, list.size())
    }
}
