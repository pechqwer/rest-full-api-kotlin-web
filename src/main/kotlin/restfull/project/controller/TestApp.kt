package restfull.project.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController
import restfull.common.exception.BadRequestData
import restfull.project.model.TestJson
import restfull.project.services.TestService
import restfull.project.utils.mapQuery


@RestController
class RestController(@Autowired private val service: TestService) {
	@GetMapping("/")
	fun find(@RequestParam query: Map<String, String>): Array<TestJson> {

		if (query.isEmpty()) throw BadRequestData("query string least anyone")

		val queryOption = mapQuery(query)

		return service.findAll(queryOption)
	}
}
