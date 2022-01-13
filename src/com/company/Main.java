package com.company;

import java.awt.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(5);
        people.add(new Person("Mike", 33));
        people.add(new Person("Jule", 16));
        people.add(new Person("Tim", 45));
        people.add(new Person("luck", 23));
        people.add(new Person("Mike", 33));

        Iterator<Person> iter = people.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            System.out.println(person.getName() + " - " + person.getAge());
            if (person.getName().length() == 2) {
                iter.remove();
            } else {
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }
        Collections.sort(people);
        System.out.println("_______");
        iter = people.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            System.out.println(person.getName() + " - " + person.getAge());

        }
        ArrayList<String> color = new ArrayList<>(3);
        color.add("black");
        color.add("white");
        color.add("Red");

        color.ensureCapacity(6);
        color.add("yellow");
        color.add("pink");
        color.add("blue");

        Iterator<String> it = color.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("______");

        Collections.sort(color);
        System.out.println("Sort");
        print(color);

        Collections.shuffle(color);
        System.out.println("Shuffle");
        print(color);

        Collections.reverse(color);
        System.out.println("Reverse");
        print(color);
    }

    public static void print(ArrayList<?> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
