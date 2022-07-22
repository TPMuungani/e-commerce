package com.pauros.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class TodoController {

    private static List<Todo> todos;
    @Autowired
    TodoService todoService;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/todos")
    public List<Todo> retrieveTodos(){
        todos.add(new Todo(10001, "Install knowage", "find the description", new Date(), new Date()));
        todoService.setTodos(todos);
        return todoService.getTodos();
    }

}