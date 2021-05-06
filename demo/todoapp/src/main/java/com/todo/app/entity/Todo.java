package com.todo.app.entity;

import lombok.Data;

@Data
public class Todo {

    private long id;
    private String title;
    private int done_flag;
    private String time_limit;
}