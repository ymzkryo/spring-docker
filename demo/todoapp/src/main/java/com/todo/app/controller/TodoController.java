package com.todo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.app.entity.Todo;
import com.todo.app.mapper.TodoMapper;

@Controller
public class TodoController {

    @Autowired
    TodoMapper todoMapper;

    @RequestMapping(value="/")
    public String index(Model model) {
    	/*
    	 * 完了/未完了タスクの一覧表示
    	 */
        List<Todo> list = todoMapper.selectIncomplete();
        List<Todo> doneList = todoMapper.selectComplete();
        model.addAttribute("todos",list);
        model.addAttribute("doneTodos",doneList);

        return "index";
    }

    @RequestMapping(value="/add")
    public String add(Todo todo) {
    	/*
    	 * タスクの追加
    	 */
        todoMapper.add(todo);
        return "redirect:/";
    }

    @RequestMapping(value="/update")
    public String update(Todo todo) {
    	/*
    	 * タスクの更新(primarykey=id)
    	 */
        todoMapper.update(todo);
        return "redirect:/";
    }
    
    @RequestMapping(value="/delete")
    public String delete() {
    	/*
    	 * タスクの削除
    	 * done_flag=1(完了)タスクのみ
    	 */
    	todoMapper.delete();
    	return "redirect:/";
    }
    
}