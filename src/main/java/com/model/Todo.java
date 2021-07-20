 package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int todoId;

    private String todoTitle;
    private String todoContent;
    private Date todoDate;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    public Date getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(Date todoDate) {
        this.todoDate = todoDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoId=" + todoId +
                ", todoTitle='" + todoTitle + '\'' +
                ", todoContent='" + todoContent + '\'' +
                ", todoDate=" + todoDate +
                ", user=" + user +
                '}';
    }
}

