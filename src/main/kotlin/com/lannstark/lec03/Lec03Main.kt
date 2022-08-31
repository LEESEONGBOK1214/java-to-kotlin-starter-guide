package com.lannstark.lec03

// 기본 타입 변환
fun main(){
    val number1 = 3
    val number2: Long = number1.toLong() // Long type으로 명시적 캐스팅

    val number3 = 3
    val number4 = 5
    val number5  = number3/ number1.toDouble() // 하나를 .toDouble()로 double 캐스팅

}

// 그 외 타입 변환?
fun printAgeIfPerson(obj : Any){ // TS와 거의 유사하다.
    // Java의 instanceof는 Kotlin에서 is
    if(obj is Person){
        val person = obj as Person
        // as Person은 생략 가능하고, 바로 인식한다는 뜻.
        // => smart cast 스마트 캐스트
        println(person.age)
    }

    // 이 객체가 아닐때 라는 구문이 하고 싶다면
    if(!(obj is Person) || (obj !is Person)){
        // 1. 괄호로 묶어서 !를 앞에 붙이는 방법.
        // 2. is 앞에 !를 붙이는 방법.  => !is
    }
}

// 자바 코드 그대로 옮긴 코드
fun printAgeIfPersonFromJava(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}


value as? Type ( Safe Call 처럼 안전한 타입 형변환이라고 생각하면 좋다. )
        - value가 Type이면 Type으로 캐스팅
        - value가 null이면 null
        - value가 Type이 아니면 null


fun string01(){
    val person = Person("이성복", 23)

    // in java
    System.out.println(String.format("이름 : %s", person.name))

    println("이름 : ${person.name}")

    // 중괄호를 없애고 $만 붙여서 사용 가능. => 일반 변수에서만
    // 하지만 ${}로 사용 하는게 좋다.
    val name = "이성복"
    println("name = $name")

}

fun string02(){
    val name = "이성복"

    val str =
    """
         이렇게 마구마구 쓰기~
         ${name}
     """.trimIndent()
    println(str)
}

fun string03(){
    // String.charAt(index) == value[index]

    val str = "ABC"
    println(str[0]) // A
    println(str[1]) // B
    println(str[2]) // C
}