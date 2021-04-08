fun main() {
  val number = 10
  try {
    val factorial = getFactorial(number)
    val sumEach = sumEach(factorial)
    println("factorial: $factorial")
    println("sumEach: $sumEach")
  } catch(e: Exception) {
    throw e
  }
}


fun sumEach(number: Int): Int =
  number
  .toString()
  .chunked(1)
  .map { it.toInt() }
  .reduce { sum, element -> sum + element }


fun getFactorial(number: Int): Int {
  var factorial: Int = number
  for(i in number - 1 downTo 1) {
    factorial = factorial.times(i)
  }

  return factorial
}
