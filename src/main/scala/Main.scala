object Main extends App {

  val naperstok = Math.floor(Math.random() % 3 + 1)

  import scala.io.StdIn

  println("Ваш баланс:")
  var balance = StdIn.readInt()

  println("Делайте ставки!")
  val rate = StdIn.readInt()

  var answer: String = null

  do {
    println("Перед вами 3 напёрстка, 2 из них пустые. Какой проверить?")

    val choise = StdIn.readInt()

    if (choise == naperstok) {
      balance += rate
      println("Угадали!" + s"Баланс: $balance")
    } else {
      balance -= rate
      println("Не угадали..." + s"Баланс:$balance")
    }
    println("Играем дальше?")
    answer = StdIn.readLine()
  } while (answer.equals("да"))
}
