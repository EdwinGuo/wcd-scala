/* higher order functions - these functions take a function as a parameter or they return a function.
 * a first-order function takes only data items.
 */

val double = (i:Int) => i * 2 // function stored in variable object
def higherOrder(x:Int, y:Int=>Int) = y(x) // pass in a function as a parameter here, y (any function that takes in an int) returns an int. Invoke function y with x as the variable being passed in)

higherOrder(6, double)

val triple = (i:Int) => i * 3
higherOrder(6, triple)

//return another function
def sayHello = (name:String) => {"Hello" + " " + name}
var message = sayHello("Andrew")

var y = 5
val multiplier = (x:Int)=> x * y //closure function
multiplier(10)

//higher order functions give us the ability to encapsulate an algorithm inside of a function
