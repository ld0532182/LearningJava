package com.javalessons.collections.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ToDoList {

    private LinkedList<String> toDoList = new LinkedList<>();

    public void addToList(String task) {
//      toDoList.add(task);
        addInAlphabeticalOrder(task);
    }

    private boolean addInAlphabeticalOrder(String task) {
        ListIterator<String> listIterator = toDoList.listIterator();
        while (listIterator.hasNext()) {
            int compared = listIterator.next().compareTo(task);
            if (compared == 0) {
                System.out.println("Task has already existed");
                return true;
            } else if (compared > 0) {
                listIterator.previous();
                listIterator.add(task);
                return true;
            }
        }
        listIterator.add(task);
        return true;
    }

    public void addToListAtPosition(int pos, String task) {
        toDoList.add(pos, task);
    }

    public void printToDoList() {
/*        for (int i = 0; i < toDoList.size(); i++){
            System.out.println("#"+i+" - "+toDoList.get(i));
        }*/
        Iterator<String> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }
    }

    public void changeTask(int pos, String task) {
        toDoList.set(pos, task);
    }

    public void removeTask(int index) {
        toDoList.remove(index);
    }

    public void removeTask(String task) {
        toDoList.remove(task);
    }

    public int getPriority(String task) {
        return toDoList.indexOf(task);
    }

}
