package com.todo.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.app.entity.Todo;

@Mapper
public interface TodoMapper {
	// 全タスク一覧
    public List<Todo> selectAll();
    
    // 未完了タスク一覧
    public List<Todo> selectIncomplete();
    
    // 完了タスク一覧
    public List<Todo> selectComplete();
    
    // タスクの追加
    public void add(Todo todo);
    
    // タスクの更新
    public void update(Todo todo);
    
    // タスクの削除
    public void delete();

}