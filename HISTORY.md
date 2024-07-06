# Task Management Project

## React App

I used the following command to set up a React App project

```
npx create-react-app task_management_client
```

## Ktor

I will utilize the New-Ktor-Project interface from the ktor website  to create the back end project. I need to specify which plugins to install in the project.

### Plugins

Installed plugins:

**Authentication**: To manage user authentication
**Routing**: To define the routes to the API endpoints
**CORS**: To allow that the FrontEnd (React) make requests to the BackEnd
**Content Negotiation**: To automatically convert the content according with the headers 'Content-Type' and 'Accept'
**Kotlinx.serialization:** To deal with JSON serialization using the kotlinx.serialization library
**Exposed**: To integrate with the database using the Exposed library
**Postgree**: To add support for the database PostgreeSQL

### Kotlin Data Class

Data classes are kotlin objects specially desined to store data. They include built-in member functions that enable tasks like comparisson, copying, accessing or setting attributes values.

For this project, there will be initially three data classes, as follows:

```
data class Task (
    val id: Int,
    val title: String,
    val description: String,
    val userId: Int
)
```

```
data class TaskInput (
    val title: String,
    val description: String,
    val userId: Int
)
```

```
data class User (
    val id: Int,
    val username: String,
    val password: String
)
```

