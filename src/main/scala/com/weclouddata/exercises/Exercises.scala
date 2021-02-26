package com.weclouddata.exercises

import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import com.weclouddata.exercises.problems._

object Exercises {
  val route: Route = pathPrefix("problems") {
    Example.solution ~
    Problem1.solution
  }
}
