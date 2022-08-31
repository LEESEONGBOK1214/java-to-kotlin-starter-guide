package com.lannstark.lec02

fun main(){
    val person = Person("공부하는 개발자")

    // Java의 Person이 getName이 nullable이면 에러.
    // notnull이면 괜찮다.
    startsWithA( person.name )
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}