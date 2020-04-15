package restfull.project.utils

import restfull.common.exception.BadRequestData


fun mapQuery(item: Map<String, String>): Map<String, Any> {
    return item
            .mapKeys { mapKeyQuery(it) }
            .mapValues { mapValueQuery(it) }
}

private fun mapKeyQuery(item: Map.Entry<String, String>): String {
    return when (item.key) {
        "id" -> "field_id"
        "name" -> "field_name"
        else -> throw BadRequestData("Bad Map Key")
    }
}

private fun mapValueQuery(item: Map.Entry<String, String>): Any {
    return when (item.key) {
        "field_id" -> item.value.toInt()
        "field_name" -> item.value
        else -> throw BadRequestData("Bad Map Query")
    }

}