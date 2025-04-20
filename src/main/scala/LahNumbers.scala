object LahNumbers {
  def factorial(n: Int): BigInt = if (n == 0) 1 else (1 to n).map(BigInt(_)).product

  def lah(n: Int, k: Int): BigInt = {
    if (k > n || k <= 0) 0
    else factorial(n) / (factorial(k) * factorial(n - k)) * factorial(n - 1) / factorial(k - 1)
  }

  def main(args: Array[String]): Unit = {
    println("Lah numbers table:")
    for (n <- 1 to 10) {
      for (k <- 1 to n) {
        print(s"${lah(n, k)}\t")
      }
      println()
    }
  }
}
