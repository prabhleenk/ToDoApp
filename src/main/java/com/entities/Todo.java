package com.entities;

import java.util.Date;

public class Todo {
    private String todoTitle;
    private String todoContent;
    private Date todoDate;

    public Todo(String todoTitle, String todoContent, Date todoDate) {

        this.todoTitle = todoTitle;
        this.todoContent = todoContent;
        this.todoDate = todoDate;
    }
    public Todo() {

    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    public void setTodoDate(Date todoDate) {
        this.todoDate = todoDate;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public Date getTodoDate() {
        return todoDate;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoTitle='" + todoTitle + '\'' +
                ", todoContent='" + todoContent +
                '}';
    }
}
