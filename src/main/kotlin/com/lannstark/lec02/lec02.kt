package com.lannstark.lec02

fun main(){

}

// nullable인 java 코드를 그대로 옮기기 때문에
// String? 처럼 ?를 붙여서 null이 들어 올 수 있음을 정의해준다.
fun startsWithA1(str: String?) : Boolean{
    // return tyep : boolean 임.  null 불가능.
    if( str == null){
        throw IllegalArgumentException("null이 들어왔습니다.");
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?) : Boolean?{
    if(str == null){
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?) : Boolean{
    if( str == null){
        return false
    }
    return str.startsWith("A")
}

fun main2(){
    val str: String? = "ABC"
    println(str.length) // null 에러 발생

    println(str?.length) // Safe Call 사용

    // 앞의 연산 결과가 null이면 뒤의 값을 사용한다. 삼항연산자 같은 느낌!
    // str이 null이면 0, 아니면 ABC니까 3이 나옴
    println(str?.length ?: 0) // Safe Call + Elvis 연산자 사용

    // Elvis인 이유는 90도 회전하면 살짝 사람 얼굴처럼 생겼는데
    // Elvis 가수분 헤어스타일과 닮아서 명명됨..
}

// startsWithA1 의 업그레이드 버전
// Safe Call, Elvis 연산자와 합쳐진 버전
fun startsWithA1_1(str: String?) : Boolean{
    // str이 null이면 throw exception, 아니면 boolean 반환
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어았습니다.")
}

// startsWithA2 의 업그레이드 버전
fun startsWithA2_1(str: String?) : Boolean?{
    return str?.startsWith("A")
}

// startsWithA3 의 업그레이드 버전
fun startsWithA3_1(str: String?) : Boolean{
    return str?.startsWith("A") ?: false
}


fun calculate(number : Long?) : Long {
    // Elvis 연산은 ealry return에도 사용할 수 있다.
    number ?: return 0
     // 다음 로직
}

// 3. 널 아님 단언!!
fun startsWith(str : String?) : Boolean {
    str.startsWith("A") // 오류 nullable
    str!!.startsWith("A") // 이제 str은 절대 null이 아니게 됨
}