object operators {
  var x = 3
  var y = 9

  var sum = x + y

  //bitwise operators
  var b1 = x&y //
  var b2 = x|y
  var b3 = x^y
  var b4 = x<<2

  val nums = 1::3::5::Nil //cons operator in Scala - two colons together. allows you to put values together and create a list

  if(x>0 || y >0) "Both values are positive"
}