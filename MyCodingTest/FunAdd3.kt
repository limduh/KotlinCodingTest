package MyCodingTest

fun main() {
    // 3개의 정수 입력 받기
    print("첫 번째 정수를 입력하세요: ")
    val num1 = readLine()!!.toInt()

    print("두 번째 정수를 입력하세요: ")
    val num2 = readLine()!!.toInt()

    print("세 번째 정수를 입력하세요: ")
    val num3 = readLine()!!.toInt()

    // 합 구하기
    val sum = calculateSum(num1, num2, num3)

    // 결과 출력
    println("입력한 정수들의 합은 $sum 입니다.")
}

// 세 정수의 합을 계산하는 함수
fun calculateSum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
