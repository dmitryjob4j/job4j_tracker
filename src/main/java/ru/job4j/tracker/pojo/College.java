package ru.job4j.tracker.pojo;
/**
 * 	2. Модель данных.[#242931]
 * 	задача
 * @since 24.03.2020
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Stepanov D. N.");
        student.setGroup("intern");
        student.setEnrolled("25.02.2020");
        System.out.println(student.getFio() + " " + student.getGroup() + " " + student.getEnrolled());
    }
}
