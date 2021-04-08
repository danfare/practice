fun main() {
  val number = 50
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
  .reduce { sum, element -> "${sum.toInt() + element.toInt()}" }
  .toInt()


fun getFactorial(number: Int): Int {
  var factorial: Int = number
  for(i in number - 1 downTo 1) {
    factorial = factorial.times(i)
  }

  return factorial
}
