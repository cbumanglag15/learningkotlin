package my.clarence.learningkt.basics
/*
    Variables:
    Read Only - val
    R/W - var

    var stuff
    val thing
 */
/**
 * Entry point. This is your main function
 */
fun main(args: Array<String>) {
    println("Basic Syntax and Functions")
    var i = addNums(3, 5)
    println("The value of i is $i")
    var e = addNums2(7,8)
    println("The value of e is $e")
    addNums3(7, 9)
}

/*
    Function type 1: Variables are declared with their data type as follows:

    (variable-name): (data-type)

    - Multiple parameters are separated by commas
    - Return types of a function are declared after the colon succeeding the
    parameters and before the first opening curly brace

 */

fun addNums(a: Int, b: Int): Int {
    return a + b
}

/*
    Function type 2: A function containing only an expression with a clear
    return type can be used
 */

fun addNums2(a: Int, b: Int) = a + b

/*
    Function type 3: Function with the return type "Unit"
    Unit is basically the same thing as "void" in Java.
    It does not have to be declared. Unit, is however,
    a Singleton class

 */
fun addNums3(a: Int, b:Int): Unit {
    // Additionally, variables can be referenced using the $ symbol
    print("The sum of $a and $b is ${a + b}")
}

/*
    String templates:
 */
fun strExmp(num: Int): String {
    var a = num * 2
    var str = "a is $a"
    return str
}

fun numCompare(a: Int, b: Int): Boolean {
    if (a > b) {
        return true
    } else if (a <= b) {
        return false
    }

    return false
}


