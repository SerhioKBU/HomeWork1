package com.serhio.java.homeworks.homework1;

import java.util.ArrayList;
import java.util.List;

public class TestTasksList {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private static ArrayList<String> currentList = new ArrayList<String>();

    public static void main(String[] args) {
        InventList list = new InventList();

        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = list.menu();
            switch (menuItem) {
                case 1:
                    list.showList();
                    break;
                case 2:
                    list.addTask();
//                case 3:
//                    doneTasks();
//                    break;
//                case 4:
//                    unDoneTasks();
                    break;
                case 0:
                    break;
                default:
                    System.out.println(ANSI_RED + "Try again. Make your choice" + ANSI_RESET);
            }
        }
    }
}