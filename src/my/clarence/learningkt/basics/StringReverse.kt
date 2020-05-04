package my.clarence.learningkt.basics

import kotlin.text.StringBuilder

/**
 * StringReverse
 *
 * Passes in a string to be reverse twice and reverses each word
 * of the string after.
 *
 */

fun main() {

    var rev: String?
    var nRev1: String
    var nRev2: String
    var nRev3: String

    println("Please enter a string to reverse")
    rev = readLine()

    while (rev!!.isBlank()) {
        println("Please enter a valid String")
        rev = readLine()
    }

    println("You have entered: $rev\n")

    nRev1 = reverseStrBuiltIn(rev)
    nRev2 = reverseStrManual(rev)
    nRev3 = reverseByWord(rev)
    printAll(nRev1, nRev2, nRev3)
}

fun reverseStrBuiltIn(str: String?): String {
    var sb = StringBuilder(str)
    sb.reverse()
    return sb.toString()
}

fun printAll(vararg revs: String) {
    for(s in revs) {
        println(s)
    }
}

fun reverseStrManual(str: String?): String {
    var sb = StringBuilder()

    for (i in str!!.length-1 downTo 0) {
        sb.append(str[i])
    }

    return sb.toString()
}

fun reverseByWord(str: String?): String {
    var sb = StringBuilder()
    var words = str!!.split(" ")

    for (word: String in words) {
        sb.append(reverseStrBuiltIn(word) + " ")
    }

    return sb.toString().trim()
}
