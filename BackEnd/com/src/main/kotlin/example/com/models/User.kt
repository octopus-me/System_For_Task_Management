package example.com.models

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Table

object UserTable : IntIdTable() {
    val username = varchar("username", 50).uniqueIndex()
    val password = varchar("password", 64)
}

data class User (
    val id: Int,
    val username: String,
    val password: String
)

