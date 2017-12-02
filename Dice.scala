/**
  * Created by developer on 18/05/2017.
  */
object Dice {
  def main(args: Array[String]): Unit = {
    val dices = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val sums = for{
      one <- (1 to dices(0))
      two <-(1 to dices(1))
    }yield(one+two)
    val mapped = sums.groupBy(identity).mapValues(_.length)
    val greatest:Map[Int, Int] = mapped.filter(t => t._2 == mapped.maxBy{case (key,value) => value}._2)
    greatest.toSeq.sortBy(_._1).foreach(e => System.out.println(e._1))
  }
}
