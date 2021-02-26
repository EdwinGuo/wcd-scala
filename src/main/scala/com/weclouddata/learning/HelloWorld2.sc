object HelloWorld {
  case class User(firstName: String, LastName: String, age: Int)

  def retrieve_args(args: Array[String]): User = {
      if (args.size != 3)
        throw new Exception("args size must be equal to 3")
      else{
        val lst = args.toList 
        User(lst(0), lst(1), lst(2).toInt)
      }
       
  }
  def main(args: Array[String]): Unit = { // colon specifies return type. unit is similar to void, meaning it doesn't return anything
    // this is my first Scala program
    println("Hello, world!")
    /*
     * declare variables
     */
    val user = retrieve_args(args) 
    println("user " + user)
    //var firstName:String = "Andrew"
    //val age:Int = 30 // immutable data type (cannot change)
    //println(firstName + ", is "+age+" years old")
    //var sum = 10 + 25 // scala can infer data type, as it does here
    def function1:Unit = {
      println("This is function1")
    }
    function1 // invoke function call
  } // lambdas are anonymous functions
}
