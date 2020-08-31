package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Student studentSergij = new Student("Sergij","Ivasyuk","Dmitrovich", true, 1 ,"Inform",
            LocalDate.of(1993,06,23), 170, 70, "Chernowitza", 506096125, "sergo231993@gmail.com",
            "середня", "денна", "Dmitro", "Korniyovich", "Ivasyuk");

              System.out.println(studentSergij.toString());
    }

}
