package restfull.common.exception

import java.util.*

class BadRequestData(override val message: String?) : Exception(message)

class NotFound(override val message: String?) : Exception(message)

class ExceptionFail(override val message: String?) : Exception(message)

data class ErrorsDetails(val time: Date, val message: String, val details: String)