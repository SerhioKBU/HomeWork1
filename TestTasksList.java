package com.serhio.java.homeworks.homework1;

public class TestTasksList {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
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
                    break;
                case 3:
                    list.pickDoneTask();
                    break;
                case 4:
                    list.showDoneTasksList();
                  break;
                    break;
                case 0:
                    break;
                default:
                    System.out.println(ANSI_RED + "Try again. Make your choice" + ANSI_RESET);
            }
        }
    }
}
