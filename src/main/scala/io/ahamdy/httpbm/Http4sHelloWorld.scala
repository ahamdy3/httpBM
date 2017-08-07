package io.ahamdy.httpbm

import org.http4s.{HttpService, Request, Response}
import org.http4s.dsl._
import org.http4s.server.{Server, ServerApp}
import org.http4s.server.blaze.BlazeBuilder

import scalaz.concurrent.Task

object Http4sHelloWorld extends ServerApp {
  val route : PartialFunction[Request, Task[Response]] = {
    case GET -> Root / "test" => Ok("alive")
  }

  override def server(args: List[String]): Task[Server] =
    BlazeBuilder
    .bindHttp(8080, "0.0.0.0")
    .mountService(HttpService(route))
    .start
}
