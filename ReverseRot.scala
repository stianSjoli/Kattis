/**
  * Created by developer on 19/05/2017.
  */
object ReverseRot {
  def newLetter(letter:Char, steps:Int):Char = {
    val letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_."
    if(letters.indexOf(letter) + steps < letters.length){
      val idx = letters.indexOf(letter) + steps
      letters(idx)
    } else{
      val idx = (letters.indexOf(letter) + steps) % letters.length
      letters(idx)
    }
  }

  def parse(line:String, list: List[String]):List[String] = {
    val lineSplitted = line.split(" ")
    if(lineSplitted(0).toInt == 0){
      list
    } else {
      val res = lineSplitted(1).reverse.map(ls => newLetter(ls, lineSplitted(0).toInt)).toList.mkString
      parse(scala.io.StdIn.readLine(), list :+ res)
    }
  }
  def main(args: Array[String]): Unit = {
    val line = scala.io.StdIn.readLine()
    parse(line, List[String]()).foreach(System.out.println)
  }
}
