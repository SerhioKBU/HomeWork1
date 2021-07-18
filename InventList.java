package com.serhio.java.homeworks.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventList implements TasksList {
    private ArrayList<String> tasksList = new ArrayList<String>();
    private List<String> doneTasksList = new ArrayList<String>();
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    @Override
    public int menu() {
        System.out.println(ANSI_GREEN + "------ Main Menu -------" + ANSI_RESET);
        System.out.println("0. Exit the program");
        System.out.println("1. Show tasks list");
        System.out.println("2. Add a task to the list");
        System.out.println("3. Pick the task which have already done");
        System.out.println("4. Show the tasks that have already done\n");
        System.out.print("Enter your choice number from 0 to 4: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void showList() {
        System.out.println(ANSI_BLUE + "Tasks List" + ANSI_RESET);
        System.out.println("----------------------");
        int number = 0;
        for (String item : tasksList) {
            System.out.println(++ number + "." + " " + item);
        }
    }

    @Override
    public void addTask() {
        System.out.println(ANSI_YELLOW + "Add Task" + ANSI_RESET);
        System.out.println("----------------------");
        System.out.print("Enter a task: ");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        tasksList.add(task);
        //showList();
    }

    @Override
    public void pickDoneTask() {
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick the task number which already DONE: ");
        int index = scanner.nextInt();
        if ((index - 1) < 0 || index > tasksList.size()) {
            System.out.println(ANSI_RED + "Wrong index number! Please enter in range of 1 to "
                    + tasksList.size() + ANSI_RESET);
        } else {
            doneTasksList.add(tasksList.remove(index - 1));
        }
        System.out.println("----------------------");
        showList();
    }

    @Override
    public void showDoneTasksList() {
        System.out.println(ANSI_PURPLE + "Done Tasks List" + ANSI_RESET);
        System.out.println("----------------------");
        int number = 0;
        for (String item : doneTasksList) {
            System.out.println(++ number + "." + " " + item);
        }
    }
}
