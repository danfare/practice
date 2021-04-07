
fun main() {
  val number = 764532
  try {
    isPrime(number)
    println("$number is a prime number.")        
  } catch(e: Exception) {
      throw e
  }
}

fun isPrime(subject: Int) {
  // what makes a prime number?
  // if it is divisible by any numbers lower than it
  // using modulus we can tell this by taking a number lower than `subject`
  // and iterating, dividing by two. if there is no remainder it is not a prime number
	   
  // 0 and 1 are not prime numbers 
	if (subject > 1) {
    // get rid of even numbers
      for (inc in 2..subject / 2) {
        when ( subject % inc == 0) {
          true ->
            throw Exception("$subject is not prime. It is divisble by $inc.")
      }
    }
  }
}
