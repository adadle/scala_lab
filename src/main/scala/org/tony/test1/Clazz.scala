package org.tony.test1

/**
 * Created by TonyLee on 2014/8/20.
 * By IDEA
 */
class Clazz {
  private var sum =0
  def add(b:Byte):Unit={
    sum += b
  }
  // if
  def test(str:String){ "will be lost" }

  def test1(str:String) = { "will return string" }

  def test0(str:String) : Unit = { "will return string" }

}

object Clazz{
  def main(args: Array[String]) {
    /*
    var c1 = new Clazz
    println("init: "+c1.sum)
    c1.add(2)
    println("one: "+c1.sum)
    c1 = new Clazz
    var a = 3.toByte
    c1.add(a)
    println("two: "+c1.sum)
*/

    val c = new Clazz
    println(c.test0("1"))
    println(c.test("1"))
    println(c.test1("1"))



  }

}
