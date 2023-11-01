package Algorithms_QuestionSet_V1.solutions

fun sieveOfEratosthenes(N: Int): List<Int> {
    val isPrime = BooleanArray(N + 1) { true }
    val primes = mutableListOf<Int>()

    for (p in 2..N) {
        if (isPrime[p]) {
            primes.add(p)
            for (i in p * p..N step p) {
                isPrime[i] = false
            }
        }
    }

    return primes
}

fun main() {
    val N = 10
    val result = sieveOfEratosthenes(N)
    println("Prime numbers up to $N: $result")
}
