package ru.job4j.tracker.oop;

/**
 * 1.7. Состояние объекта.[#242919]
 * задача
 *
 * @author dstepanov
 * @since 20.03.2020
 */
public class Battery {
    private int load;

    /**
     * конструктор для инициализации ночального состояния поля класса
     *
     * @param size
     */
    public Battery(int size) {
        this.load = size;
    }

    /**
     * exchanga - метод для распределения заряда
     *
     * @param another
     */
    public void exchanga(Battery another) {
        int charge = this.load;
        this.load -= charge - another.load;
        another.load += charge - another.load;
    }

    public static void main(String[] args) {
        Battery bank = new Battery(100);
        Battery phone = new Battery(30);
        System.out.println("bank battery : " + bank.load + ". phone battery : " + phone.load);
        bank.exchanga(phone);
        System.out.println("bank battery : " + bank.load + ". phone battery : " + phone.load);
    }

}
