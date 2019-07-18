package org.indigoshift.example

import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import akka.stream.ActorMaterializer
import com.typesafe.scalalogging.LazyLogging
import scalaz.EitherT.{eitherT, fromDisjunction => pure}
import scalaz.Scalaz._
import scalaz.\/

import scala.concurrent.{ExecutionContext, Future}

object ExampleApp extends App with LazyLogging {
  implicit val system: ActorSystem = ActorSystem("sample")
  implicit val materializer: ActorMaterializer = ActorMaterializer()
  implicit val executionContext: ExecutionContext = system.dispatcher

  val config = ConfigFactory.load("org/indigoshift/example/application")

  val run: () => Future[String \/ Unit] = { () =>
    (for {
      s <- eitherT(Server.start(config.getString("example.host"), config.getInt("example.port"), Endpoint.route))
    } yield {
//      logger.info(s"Started server on host = ${config.getString("host")} and port = ${config.getInt("port")}")
      logger.info("blah")
    }).run
  }

  run()
}