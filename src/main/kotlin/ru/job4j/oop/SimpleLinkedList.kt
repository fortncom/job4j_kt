package ru.job4j.oop

import java.util.*

class SimpleLinkedList<T : Any> : Iterable<T> {

    var size = 0
    private var head : Node<T>? = null

    fun add(value: T) {
        if (head != null) {
            val newNode = Node(value)
            newNode.next = head
            head = newNode
        } else {
            head = Node(value)
        }
        size++
    }

    fun get(index: Int): T {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException("Index: $index, Size: $size")
        }
        var currentNode: Node<T>? = head
        repeat(index) {
            currentNode = currentNode?.next
        }
        return currentNode!!.value
    }

    fun remove (index: Int): T {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException("Index: $index, Size: $size")
        }
        var rsl: T
        var currentNode: Node<T>? = head
        if (index != 0) {
            repeat(index - 1) {
                currentNode = currentNode?.next
            }
            val prev: Node<T>? = currentNode
            val target: Node<T>? = currentNode?.next
            val next: Node<T>? = target?.next
            prev!!.next = next
            rsl = target!!.value
        } else {
            val target: Node<T>? = currentNode
            val next: Node<T>? = target?.next
            head = next
            rsl = target!!.value
        }
        size--

        return rsl
    }

    override fun iterator(): Iterator<T> {
        return LinkedIt()
    }

    inner class LinkedIt : Iterator<T> {

        var cursor = 0
        var currentNode: Node<T>? = head
        var returnNode: Node<T>? = null

        override fun hasNext(): Boolean = cursor < size

        override fun next(): T {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            cursor++
            returnNode = currentNode
            currentNode = currentNode!!.next
            return returnNode!!.value
        }

    }

    class Node<K>(val value: K, var next: Node<K>? = null)
}
