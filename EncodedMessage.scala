/**
  * Created by developer on 21/05/2017.
  */
import scala.math.sqrt

object EncodedMessage {
  def grid(size:Int, line:String,list: List[String]):List[String] = {
    if(line.isEmpty){
      list
    } else{
      grid(size, line.drop(size), list :+ line.take(size))
    }
  }

  def transpose(list:List[String], transposed:List[String]):List[String] = {
    if(list.isEmpty){
      transposed
    } else {
      val trans:String = list.reverse.map(c => c.head).mkString
      val left = list.reverse.map(c => c.tail)
      transpose(left, transposed :+ trans)
    }
  }

  def main(args: Array[String]): Unit = {
    val n:Int =  scala.io.StdIn.readInt()
    val res = (1 to n) map (_ => {
      val line = scala.io.StdIn.readLine()
      val size:Int = sqrt(line.length).toInt
      val list:List[String] = grid(size, line, List[String]())
      transpose(list, List[String]()).mkString
    })
    res foreach(System.out.println)
  }
}
