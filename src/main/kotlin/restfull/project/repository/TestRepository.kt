package restfull.project.repository

//import org.springframework.jdbc.core.JdbcTemplate
//import org.springframework.jdbc.core.RowMapper


//@Repository
//class TestRepository(@Autowired private val jdbcTemplate: JdbcTemplate) : RowMapper<TestJson> {
//    override fun mapRow(rs: ResultSet, rowNum: Int): TestJson {
//        return TestJson().apply {
//            id = rs.getInt("field_id")
//            name = rs.getString("field_name").trim()
//        }
//    }
//
//    fun findall(option: Map<String, Any> = mapOf()): List<TestJson> {
//        var sql = "select *" +
//                " from  "
//
//        val args = option.values.toTypedArray()
//
//        return jdbcTemplate.query(sql, args, this)
//    }
//}


