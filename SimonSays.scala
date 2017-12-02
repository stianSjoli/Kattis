/**
  * Created by developer on 19/05/2017.
  */
object SimonSays {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val lines = (1 to n) map(_ => {
      val line = scala.io.StdIn.readLine()
      if(line.contains("Simon says")){
        line.replace("Simon says", " ").tail
      } else {

      }
    })
    lines.foreach(System.out.println)
  }
}
