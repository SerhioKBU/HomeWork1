package com.serhio.java.homeworks.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventList implements TasksList {
    private List<String> currentList = new ArrayList<String>();

    @Override
    public int menu() {
        System.out.println("------Tasks list-------");
        System.out.println("0. Exit the program");
        System.out.println("1. Display tasks list");
        System.out.println("2. Add task to list");
        System.out.println("3. Pick a task which already done");
        System.out.println("4. Display tasks that have already done");
        System.out.println("5. Display tasks that haven't done yet\n");
        System.out.print("Enter your choice number from 0 to 4: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void showList() {
        System.out.println("Tasks List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");

    }

    @Override
    public void addTask() {
        System.out.println("Add Task");
        System.out.println("----------------------");
        System.out.print("Enter a task: ");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        currentList.add(task);
        showList();
    }

    @Override
    public void pickDoneTask() {

    }

//    @Override
//    public void showUndoneTasksList() {
//
//    }
//
//    @Override
//    public void showDoneTasksList() {
//
//    }
}
