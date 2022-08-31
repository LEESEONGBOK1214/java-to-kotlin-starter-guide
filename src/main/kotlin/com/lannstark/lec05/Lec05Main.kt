package com.lannstark.lec05

/*

in java

private void validateScoreIsNotNegative(int score){
    if(score < 0){
        throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score);
    }
}
위 메소드를 코틀린으로 작성
 */


// Java 코드와 다른 점
// 1. Unit 반환 타입 지정이 생략됨
// 2. 함수 만들 때 fun을 사용
// 3. Exception을 던질 때 new를 사용하지 않음
fun validateScoreIsNotNegative(score: Int) {
    if(score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.");
    }
}

// ----------------------------------------------------------------

/*

private String getPassOrFail(int score){
    if(score>=50){
        return "P";
    }else {
        return "F";
    }

}
위 코드를 코틀린 코드로 수정한다면,
 */

// Java의 if-else와 완전히 동일하지만 한 가지 다른 점이 있다.
// Java에서 if-else는 Statement지만,
// Kotlin에서는 Expression입니다.
fun getPassOrFail(score : Int) : String {
    if( score >= 50){
        return "P"
    }else {
        return "F"
    }
}

자바에서
int score = 30 + 40;
30 + 70은 하나의 결과가 나옵니다. Expression이면서 Statement


// ----------------------------------------------------------------

fun judgeNumber(number : Int){
    when(number){
        1,0,-1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

// ----------------------------------------------------------------


fun judgeNumber2(number : Int){
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다..")
    }
}

// ----------------------------------------------------------------
// ----------------------------------------------------------------

