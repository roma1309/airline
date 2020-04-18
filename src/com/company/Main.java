package com.company;

import java.util.Date;
import java.util.Scanner;
import java.sql.*;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/java_base";
    public static final String USER = "postgres";
    public static final String PASS = "13Hockey1309";

    public static void main(String[] args) throws SQLException {


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
                FunctionAdd.Add();
            }

            if (w == 4) {
                MenuWorker.menu3();
                FunctionDelete.Delete();
            }
            if (w == 5) {
                MenuWorker.menu4();
                FunctionUpdate.Update();
            }
            if (w == 0) {
                MenuWorker.menu6();
                continueLoop = false;
                break;
            }
            else
                if (w > 5) {
                    System.out.println("Вы ввели неверную команду !!!!!!!");

                }
            }
        }
    }
