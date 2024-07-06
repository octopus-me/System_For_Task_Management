package example.com.plugins

import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import example.com.models.UserTable
import example.com.models.TaskTable

fun Application.configureDatabase() {
    val dbConfig = environment.config.config("database")
    val jdbcUrl = dbConfig.property("jdbcUrl").getString()
    val driverClassName = dbConfig.property("driverClassName").getString()
    val username = dbConfig.property("username").getString()
    val password = dbConfig.property("password").getString()

    Database.connect(
        url = jdbcUrl,
        driver = driverClassName,
        user = username,
        password = password
    )

    transaction {
        SchemaUtils.create(UserTable, TaskTable)
    }
}
