package com.company;

import com.company.function.*;

import java.util.Scanner;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        MenuWorker.choice();

        boolean continueLoop = true;
        Scanner scan = new Scanner(System.in);
        while (continueLoop) {
            MenuWorker.showMenu();

            int w = Integer.valueOf(scan.nextLine());

            if (w == 1) {
                MenuWorker.menu1();
                FunctionOutput.output();

            }
            if (w == 2) {
                MenuWorker.menu5();
                FunctionById.byId();

            }
            if (w == 3) {
                MenuWorker.menu2();
                FunctionAdd.add();
            }

            if (w == 4) {
                MenuWorker.menu3();
                FunctionDelete.delete();
            }
            if (w == 5) {
                MenuWorker.menu4();
                FunctionUpdate.update();
            }
            if (w == 0) {
                MenuWorker.menu6();
                continueLoop = false;
                break;
            } else if (w > 5) {
                System.out.println("Вы ввели неверную команду !!!!!!!");

            }
        }
    }
}
