package com.itesm.todo.controller;

import com.itesm.todo.model.Todo;
import com.itesm.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("/create")
    public ResponseEntity<?> createTodo(@RequestBody Todo todo){
        todo=todoService.saveTodo(todo);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<?> listTodo(){
        List<Todo> todoList= todoService.findAll();
        return new ResponseEntity<>(todoList,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateTodo(@RequestBody Todo todo){
        todo= todoService.saveTodo(todo);
        return new ResponseEntity<>(todo,HttpStatus.OK);
    }

    @GetMapping("/find")
    public ResponseEntity<?> findById(@RequestParam("id")int id){
        Todo todo= todoService.findById(id);
        return new ResponseEntity<>(todo,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteById(@RequestParam("id")int id){
        todoService.deleteTodo(id);
        Map<String,String> response= new HashMap<>();
        response.put("message","Todo with id "+id+" deleted");
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping("/toggle-complete")
    public ResponseEntity<?> markAsComplete(@RequestParam("id")int id){
        Todo todo= todoService.toggleComplete(id);
        return new ResponseEntity<>(todo,HttpStatus.OK);
    }
}
