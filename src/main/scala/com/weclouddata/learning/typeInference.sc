object typeInference {
  val num = 5
  val decimal = 5.2567
  var x = 1 + 2 * 3.5
  List(1, 2, 4.5)
  List(1, true)
  List(1, true, "Andrew")

  def addOne(x:Int) = x + 1
  def function1(x:Int) = if(x > 0) 1 else "negative"
  // type inference only applied to local variables
}