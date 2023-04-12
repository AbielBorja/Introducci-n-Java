package com.itesm.todo.service;


import com.itesm.todo.model.Todo;
import com.itesm.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public Todo saveTodo(Todo todo){
        todoRepository.save(todo);
        return todo;
    }

    public List<Todo> findAll(){
        return todoRepository.findAll();
    }

    public Todo findById(int id){
        return todoRepository.findById(id).get();
    }

    public void deleteTodo(int id){
        Todo todo= todoRepository.findById(id).get();
        todoRepository.delete(todo);
    }

    public Todo toggleComplete(int id){
        Todo todo= todoRepository.findById(id).get();
        todo.setFinished(!todo.isFinished());
        todoRepository.save(todo);
        return todo;
    }
}
