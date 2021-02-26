// Sets are iterables that contain no duplicate elements - this is what makes them unique
// http://scala-lang.org/api/current/scala/collection/Set.html

object setExamples {
  val fruit = Set("apple", "orange", "banana")
  var moreFruit = Set("kiwi", "pineapple")
  var nums = Set(1,2,3,4,5)
  var moreNums = Set(6, 7, 8, 9)

  nums.contains(5)
  nums(3)
  var mixed = fruit ++ nums // combine two sets

  nums -= 5 // remove 5 from set

  nums & moreNums // find intersection of two sets
  moreFruit.head // first element in list
  moreFruit.tail // gets everything but the first element. can call this recursively
  moreNums.isEmpty
}
