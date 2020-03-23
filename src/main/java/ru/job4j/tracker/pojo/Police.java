package ru.job4j.tracker.pojo;
/**
 * 2. Модель данных.[#242931]
 * пример
 */

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Dmitry Steapnov");
        license.setModel("Toyota");
        license.setCode("e647ex");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " Has car - " + license.getModel() + " : " + license.getCode());
    }
}
