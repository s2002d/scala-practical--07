object pQ2 {
  def calSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val squares = calSquare(inputList)
    println(squares)
  }
}
