package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Часть 004. 1. Lambda
 * 1. Анонимные классы[#242702]
 * анонимные классы для компортарота сортировки.
 *
 * @author D.Stepanov
 * @version 1
 * @since 27.04.2020
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparatorSize = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getSize() - o2.getSize();
                //return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        Comparator<Attachment> comparatorName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(comparatorSize);
        System.out.println(attachments + System.lineSeparator());
        attachments.sort(comparatorName);
        System.out.println(attachments);
    }
}

