package com.weclouddata.exercises.problems

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol
import com.weclouddata.exercises.problems.Problem1.MixedString
import com.weclouddata.exercises.problems.Example.FibonacciResult

trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  /**
    *  We’re using the Spray JSON library here, which allows us to define json marshallers (or formats how Spray JSON calls them) in a
    *  type-safe way. In other words, if we don’t provide a format instance for a type, yet we’d try to return it in a route by calling
    *  complete(someValue) the code would not compile - saying that it does not know how to marshal the SomeValue type. This has the
    *  up-side of us being completely in control over what we want to expose, and not exposing some type accidentally in our API.
    *
    *  To handle the two different payloads, the trait defines two implicit values; userJsonFormat and usersJsonFormat. Defining the
    *  formatters as implicit ensures that the compiler can map the formatting functionality with the case classes to convert.
    *  The jsonFormatX methods come from Spray JSON. The X represents the number of parameters in the underlying case classes
    *  More details: https://developer.lightbend.com/guides/akka-http-quickstart-scala/json.html
    */

  implicit val jsonFormatFibonacciResults = jsonFormat1(FibonacciResult)
  implicit val jsonFormatMixedString = jsonFormat3(MixedString)
}
