package com.example.todo_app_with_test.Repository;

import com.example.todo_app_with_test.Model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
