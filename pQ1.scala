object pQ1 {
  def EvenNum(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = EvenNum(inputList)
    println(evenNumbers) 
  }
}
