package com.pauros.ecommerce;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private  List<Todo> todos;

     {  todos = new ArrayList<>();
        todos.add(new Todo(10001, "Install Knowage", "find the description", new Date(), new Date()));
     }

    public TodoService(List<Todo> todos) {
        this.todos = todos;
    }





    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
}

