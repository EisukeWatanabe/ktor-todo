package com.todo.example.model

import org.jetbrains.exposed.sql.*

object Todos: Table() {
    val id: Column<Int> = integer("id").autoIncrement().primaryKey()
    val task: Column<String> = varchar("task", 4000)
}

data class Todo (
    val id: Int,
    val task: String
)

data class NewTodo (
    val id: Int?,
    val task: String
)
