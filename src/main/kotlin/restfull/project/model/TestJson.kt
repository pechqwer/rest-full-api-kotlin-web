package restfull.project.model


import com.fasterxml.jackson.annotation.JsonProperty

data class TestJson(
    @JsonProperty("name") var name: String? = null,
    @JsonProperty("id") var id: Int? = null
)