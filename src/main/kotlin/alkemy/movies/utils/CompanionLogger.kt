package alkemy.movies.utils

import org.slf4j.Logger
import org.slf4j.LoggerFactory

abstract class CompanionLogger {
   val log: Logger by lazy { LoggerFactory.getLogger(javaClass.enclosingClass) }
   inline fun <E> E.log(block: Logger.(E) -> Unit): E =
        also { block(log, this) }
}