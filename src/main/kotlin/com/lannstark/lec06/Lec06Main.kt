package com.lannstark.lec06

/*

List<Long> numbers = Arrays.asList(1L, 2L, 3L);
for ( long number : numbers) {
    System.out.println(number);
}
 */

fun main01(){

    val numbers = listOf(1L, 2L, 3L)
    for ( number in numbers){
        println(number)
    }
}

// ----------------------------------------------------------------



/*
전통적인 포문 값이 증가할때
for(int i=1; i<=3 ;i++){
    System.out.println(i);
}
 */


fun main02(){

    for(i in 1..3){
        println(i)
    }
}

// ----------------------------------------------------------------


/*
전통적인 포문 값이 감소할때
for(int i=3; i>=1 ;i--){
    System.out.println(i);
}
 */


fun main03(){

    for(i in 3 downTo 1){
        println(i)
    }
}


// ----------------------------------------------------------------


/*
전통적인 포문 값이 2씩 증가할때!!!
for(int i=1; i<=5 ;i+=2){
    System.out.println(i);
}
 */


fun main04(){

    for(i in 1..5 step 2){
        println(i)
    }
}


// ----------------------------------------------------------------
