# Project Challenge: Task Management System with Focus Time Feature

## Overview
Develop a task management system that includes a focus time (pomodoro) feature. The system will allow users to create, update, delete, and view tasks. Additionally, users will be able to use a timer feature to enhance their productivity.

## Required Technologies
- **Backend**:
  - **Ktor**: To create the API.
  - **Kotlin**: Programming language.
  - **GraphQL**: For communication between frontend and backend.
  - **Database**: Use PostgreSQL or MongoDB.
- **Frontend**:
  - **React**: To create the user interface.
  - **Apollo Client**: To integrate with GraphQL.

## Features

1. **User Authentication**
   - Register new users.
   - Login existing users.
   - Logout.

2. **Task Management**
   - Create a new task with title, description, and due date.
   - Update an existing task.
   - Delete a task.
   - Mark a task as completed.
   - List all tasks of a user.
   - Filter tasks by status (pending, completed).

3. **Focus Time (Pomodoro)**
   - Start, pause, and reset a focus timer.
   - Default cycle of 25 minutes work and 5 minutes break.
   - Log focused time by task.

4. **Progress Visualization**
   - View progress of completed tasks.
   - Charts showing the amount of focused time on each task (use a chart library like Chart.js).

## Project Structure

### Backend (Ktor + GraphQL + Database)
1. **Project Setup**
   - Initialize a Ktor project with GraphQL support.
   - Configure the database (PostgreSQL or MongoDB).

2. **GraphQL Schema**
   - Define types, queries, and mutations in the GraphQL schema.

3. **Data Models**
   - Create data models for User and Task.

4. **Resolving Queries and Mutations**
   - Implement resolvers for queries and mutations, including authentication and CRUD operations for tasks.

5. **Authentication**
   - Implement JWT for user authentication.

### Frontend (React + Apollo Client)
1. **Project Setup**
   - Initialize a React project.
   - Configure Apollo Client for communication with the GraphQL backend.

2. **Components**
   - **Authentication**: Components for login, registration, and logout.
   - **Task Management**: Components for creating, updating, deleting, and listing tasks.
   - **Focus Time**: Timer component with start, pause, and reset functionality.
   - **Progress Visualization**: Components for charts and statistics.

3. **State Management**
   - Use React Context or Redux to manage the global state of the application.

### Documentation and Delivery
1. **README.md**
   - Project description.
   - Technologies used.
   - Installation and setup instructions.
   - Usage examples.

2. **COMMENTS.md or HISTORY.md**
   - Record your decisions, issues faced, and how you resolved them.
   - Note ideas for additional features you would implement if you had more time.

3. **Docker**
   - Create a `docker-compose.yml` file to facilitate the development environment setup.

## Tips
- **Automation**: Use CI/CD tools for automated testing and deployment.
- **Documentation**: Keep documentation clear and concise.
- **Best Practices**: Follow best development practices, such as code organization and version control.

## Good Luck!
This challenge will not only help strengthen your backend and frontend development skills but also provide valuable hands-on experience that you can highlight in future interviews and portfolios.
