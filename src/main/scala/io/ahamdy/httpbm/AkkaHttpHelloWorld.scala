package io.ahamdy.httpbm

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Directives._

object AkkaHttpHelloWorld {

  def main(args: Array[String]) {

    implicit val system = ActorSystem("my-system")
    implicit val materializer = ActorMaterializer()


    val route =
      path("test") {
        get {
          complete("alive")
        }
      }

    Http().bindAndHandle(route, "localhost", 8080)
  }
}
