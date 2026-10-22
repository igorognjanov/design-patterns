package com.test.creational;

import java.util.ServiceLoader;

public class Application {

    //   Prototype

    //public static void main(String[] args) {
    //
    //    Document report = new Report("Igor", "Content");
    //
    //    System.out.printf("%s, %s%n", report.getTitle(), report.getContent());
    //
    //    //Document copy = report.clone();
    //    Document copy = report;
    //
    //    report.setContent("Haleluja");
    //
    //    System.out.printf("%s, %s%n", copy.getTitle(), copy.getContent());
    //
    //
    //}

    // Builder

    //public static void main(String[] args) {
    //    User user = new User.Builder()
    //        .firstName("igor")
    //        .age(25)
    //        .lastName("ASdx")
    //        .build();
    //
    //}

    // Singleton

    //public static void main(String[] args) {
    //    var connection = DatabaseConnectionManager.getInstance().getConnection();
    //    var connection2 = DatabaseConnectionManager.getInstance().getConnection();
    //
    //    System.out.println(connection);
    //
    //    connection.query("select * from public.pg_stat_activity;");
    //}


    // Factory method

    //public static void main(String[] args) {
    //    NotificationFactory notificationFactory1 = new SMSNotificationFactory();
    //    NotificationFactory notificationFactory2 = new EmailNotificationFactory();
    //
    //    notificationFactory1.sendNotification();
    //    notificationFactory2.sendNotification();
    //}


    // Abstract factory

    //public static void main(String[] args) {
    //    UIFactory uiFactory = new WindowsUIFactory();
    //
    //    Button button = uiFactory.createButton();
    //    Checkbox checkbox = uiFactory.createCheckbox();
    //
    //    button.render();
    //    checkbox.render();
    //}

    public static void main(String[] args) {
    }

}
