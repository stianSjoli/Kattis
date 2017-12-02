/**
  * Created by developer on 20/05/2017.
  */
object SecureDoors {
  def entries(n:Int, list:List[String]):List[String] = {
    if(n == 0){
      list
    } else{
      val line = scala.io.StdIn.readLine().split(" ")
      line(0) match{
        case "entry" => {
          val str = line(1) + " " + "entered"
          if(list.contains(str)){
            entries(n-1, list :+ (str + " " + "(ANOMALY)"))
          } else{
            entries(n-1, list :+ (str))
          }
        }
        case "exit" => {
          val str = line(1) + " " + "exited"
          if(list.contains(str) || list.contains(line(1) + " " + "entered") != true){
            entries(n-1, list :+ (str + " " + "(ANOMALY)"))
          } else{
            entries(n-1, list :+ (str))
          }
        }
        }
      }
    }

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val e = entries(n, List[String]())
    e.foreach(System.out.println)
  }
}
