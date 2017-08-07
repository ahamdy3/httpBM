package io.ahamdy.httpbm

import com.twitter.finagle.Http
import com.twitter.util.Await
import io.finch._

object FinchHelloWorld extends App {
  val hello: Endpoint[String] =
    get("test") {
      Ok("alive")
    }

  Await.ready(Http.server.serve(":8080", hello.toServiceAs[Text.Plain]))
}
