package my.clarence.learningkt

import kotlin.text.StringBuilder

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
    nRev3 = reversePerWord(rev)
    printAll(nRev1, nRev2)
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
    var letters = str!!.toCharArray()
    var i = letters.size
    var letr = str[0]
    while (i > 0) {
        sb.append(letters[i-1])
        i--
    }

    return sb.toString()
}

fun reversePerWord(str: String?): String {
    var sb = StringBuilder()
    var words = str!!.split(" ")
    return sb.toString()
}
