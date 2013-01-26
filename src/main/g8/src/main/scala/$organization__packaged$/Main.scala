package $organization$

import java.security.Security

import org.slf4j.LoggerFactory
import org.bouncycastle.jce.provider.BouncyCastleProvider

object Main {

  Security.addProvider(new BouncyCastleProvider)

  val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    logger.info("$name$")
  }

}
