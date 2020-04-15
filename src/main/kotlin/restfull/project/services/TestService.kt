package restfull.project.services

import org.springframework.stereotype.Service
import restfull.project.model.TestJson
//import restfull.project.repository.TestRepository


@Service
class TestService(
//    @Autowired private val testRepository: TestRepository
) {
    fun findAll(option: Map<String, Any>): Array<TestJson> {
//        val item = testRepository.findall(option).toTypedArray()
//        if (item.isEmpty()) throw NotFound("ไม่พบข้อมูล")
//        return item.toTypedArray()
        return emptyArray()
    }
}
