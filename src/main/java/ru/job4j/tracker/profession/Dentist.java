package ru.job4j.tracker.profession;

public class Dentist extends Doctor {
    public String tooch;

    public String getTooch() {
        return tooch;
    }
    public Diagnose heal(Pocient pocient){
        return heal(pocient);
    }
}
