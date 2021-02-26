package com.weclouddata.exercises

object Practice extends App {
  case class Address (city: String)
  case class Person (name: String, age: Int, address: Address)

  val persons = Seq(
    Person("A", 15, Address("Montreal")),
    Person("B", 24, Address("Sherbrooke")),
    Person("C", 62, Address("Montreal")),
    Person("D", 8, Address("Montreal")),
    Person("E", 90, Address("Quebec")),
    Person("F", 34, Address("Granby")),
    Person("G", 21, Address("Montreal"))
  )

  printStatus(persons)

  /*
  Should output:

  D is young [8]
  A is young [15]
  G is young [21]
  B is mature [24]
  F is mature [34]
  C is mature [62]
  E is mature [90]
  */
 def printStatus(p: Seq[Person]) : Unit = ???

 val cs = getCityStats(persons)
 /*
 The following should pring:

 Quebec -> 1
 Granby -> 1
 Montreal -> 4
 Sherbrooke -> 1
 */
cs.foreach(a => println(s"${a._1} -> ${a._2}"))

def getCityStats(p: Seq[Person]) : Map[String, Int] = ???
}
