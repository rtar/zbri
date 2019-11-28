package zbri

import zio._
import zio.console._

object Main extends zio.App {

  def run(args: List[String]): ZIO[ZEnv, Nothing, Int] =
    putStrLn("Enter anything:") *>
    getStrLn flatMap { line =>
      putStrLn(s"You entered: $line") as 0
    } orElse ZIO.succeed(1)

}