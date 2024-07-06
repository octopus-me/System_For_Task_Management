package example.com.models

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.ReferenceOption
import org.jetbrains.exposed.sql.Table

object TaskTable : IntIdTable() {
    val title = varchar("title", 255)
    val description = text("description")
    val userId = reference("user_id", UserTable,  onDelete = ReferenceOption.CASCADE)
}

data class Task (
    val id: Int,
    val title: String,
    val description: String,
    val userId: Int
)