/**
  * Created by developer on 19/05/2017.
  */
import scala.math._

object Sibice {
  def main(args: Array[String]): Unit = {
    val line = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val res = (1 to line(0)) map(_ => {
      val length = scala.io.StdIn.readInt()
      if(length <= line(1) || length <= line(2)){
        "DA"
      } else if( length <= sqrt(line(1)*line(1) + line(2)*line(2))){
        "DA"
      } else {
        "NE"
      }
    })
    res foreach(System.out.println(_))
  }
}
