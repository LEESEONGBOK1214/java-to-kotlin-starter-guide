package com.lannstark.lec04

fun main() {
    // 비교 연산자 객체 사용 시 자동으로 compareTo 사용
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    // 동등성 동일성

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4) // 주소가 같은지
    println(money3 === money5) // 주소가 같은지
    println(money4 == money5) // 값이 같은지 정의로 가면 equals가 나옴
    
    // ------------------
    
    // lazy 연산 확인
    if(fun1() || fun2()){
        println("본문")
    }
    
    /* 결과
    fun 1
    본문
    
    fun2는 fun1이 true라서 실행하지 않고 넘어감
     */


    // ---------------------
    // 코틀린에서 객체마다 연산자 직접 정의

    // 객체에 plus 메소드 정의하면 + 가 plus 메소드로 변경됨
    // 사용 시 money1 + money2

    val money01 = Money(1_000L)
    val money02 = Money(2_000L)
    println(money01.plus(money02)) // plus method 사용
    println(money01 + money02) // plus opertaion 사용
}


fun fun1() : Boolean {
    println("fun 1")
    return true;
}

fun fun2() : Boolean {
    println("fun 2")
    return false;
}