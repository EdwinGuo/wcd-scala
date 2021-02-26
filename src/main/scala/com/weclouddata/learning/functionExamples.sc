object functionExamples {
  def abs(x:Int) = if(x < 0) -x else x
  abs(-5)

  def fac(n:Int) = {
    var r = 1
    for(i <- 1 to n)
      r = r * i
      r }
  fac(5)

  //recursive function
  def factorial(n:Int):Int = if(n<=0) 1 else n * factorial(n-1)
  factorial(5)

  //brackets used for default values here
  def printName(left:String="[", firstName:String, lastName:String, right:String="]") {
    println(left + firstName + " " + lastName + right)
  }
  printName(firstName = "Andrew", lastName = "Goss")

  //int declared as a pointer, points to first argument in arguments list (variable length)
  def sum(args:Int*) = {
    var result = 0
    for(arg <- args) result += arg
    result
  }
  sum(1,2,3,4,5)
}