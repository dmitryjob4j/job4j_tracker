package ru.job4j.stragery;

/**
 * 7. Шаблон проектирования - Стратегия.[#242894]
 *
 * @author DStepanov
 * @version 1
 * @since 02.04.2020
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());
    }
}
