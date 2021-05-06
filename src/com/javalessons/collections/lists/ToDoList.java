package com.javalessons.collections.lists;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> toDoList = new ArrayList<>();

    public void addToList(String task) {
        toDoList.add(task);
    }

    public void addToListAtPosition(int pos, String task) {
        toDoList.add(pos, task);
    }

    public void printToDoList(){
        for (int i = 0; i < toDoList.size(); i++){
            System.out.println("#"+i+" - "+toDoList.get(i));
        }
    }

    public void changeTask(int pos, String task){
        toDoList.set(pos, task);
    }

    public void removeTask(int index){
        toDoList.remove(index);
    }

    public void removeTask(String task){
        toDoList.remove(task);
    }

    public int getPriority(String task){
        return toDoList.indexOf(task);
    }

}
