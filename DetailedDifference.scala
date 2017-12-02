/**
  * Created by developer on 19/05/2017.
  */
object DetailedDifference {
  def main(args: Array[String]): Unit = {
    val elements = scala.io.StdIn.readInt()
    val res = (1 to elements) map(_ => {
      val lineOne = scala.io.StdIn.readLine()
      val lineTwo = scala.io.StdIn.readLine()
      val lineThree = (lineOne, lineTwo).zipped map((one, two) => if(one == two) {
        '.'
      } else '*')
      (lineOne, lineTwo, lineThree)
    })
    res foreach(line => {
      System.out.println(line._1)
      System.out.println(line._2)
      System.out.println(line._3)
      System.out.println()
    })
  }
}
