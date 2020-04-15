package restfull.common.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import restfull.common.exception.BadRequestData
import restfull.common.exception.ErrorsDetails
import restfull.common.exception.ExceptionFail
import restfull.common.exception.NotFound
import java.util.*

@ControllerAdvice
class ControllerAdviceRequestError : ResponseEntityExceptionHandler() {
    @ExceptionHandler(value = [(BadRequestData::class)])
    fun handleBadDataAlreadyExists(ex: BadRequestData, request: WebRequest): ResponseEntity<ErrorsDetails> {
        val errorDetails = ErrorsDetails(Date(),
                "Validation Failed",
                ex.message!!
        )
        return ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(value = [(NotFound::class)])
    fun handleNotFoundAlreadyExists(ex: NotFound, request: WebRequest): ResponseEntity<ErrorsDetails> {
        val errorDetails = ErrorsDetails(Date(),
                "Validation Failed",
                ex.message!!
        )
        return ResponseEntity(errorDetails, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler(value = [(ExceptionFail::class)])
    fun handleExcepionAlreadyExists(ex: ExceptionFail, request: WebRequest): ResponseEntity<ErrorsDetails> {
        val errorDetails = ErrorsDetails(Date(),
                "Validation Failed",
                ex.message!!
        )
        return ResponseEntity(errorDetails, HttpStatus.UNAUTHORIZED)
    }
}