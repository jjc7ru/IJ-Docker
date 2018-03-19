package example

import example.SparkTrait.SparkSessionWrapper

object AppMain extends SparkSessionWrapper {

  def main(args: Array[String]) = {
    spark.sparkContext.setLogLevel("ERROR")
    println("Hello Docker!")
  }

  close
}
