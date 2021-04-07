fun main() {
    val string = "aaabbccccd"
    println(compress(string))
}

// returns a compressed string counting the characters before it. 
// e.g. aabccc would return "a2b1c3
fun compress(string: String): String {
    var compressed: String = ""
    string
        .chunked(1)
        .groupingBy { it.first() }
        .eachCount()
        .forEach { k, v -> compressed += "${k}${v}" }

    return compressed
}
