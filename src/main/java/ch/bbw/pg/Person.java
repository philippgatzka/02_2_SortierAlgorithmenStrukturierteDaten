package ch.bbw.pg;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author P. Gatzka
 * @version 28.09.2021
 * Project: 02_2_SortierAlgorithmenStrukturierteDaten
 */
public class Person implements Comparable<Person>{

    private String firstname;
    private String lastname;
    private double height;
    private int shoeSize;
    private int age;

    public static Comparator<Person> comparatorA = (o1, o2) -> {
        int shoeVal = Integer.compare(o1.shoeSize,o2.shoeSize);
        if (shoeVal == 0)
            return Double.compare(o1.height,o2.height);
        return shoeVal;
    };

    public static Comparator<Person> comparatorB = (o1, o2) -> {
        int nameVal = o1.lastname.compareTo(o2.lastname);
        if (nameVal == 0)
            return Integer.compare(o1.age,o2.age);
        return nameVal;
    };


    public Person(String firstname, String lastname, double height, int shoeSize, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.shoeSize = shoeSize;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", height=" + height +
                ", shoeSize=" + shoeSize +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        int lastnameVal = lastname.compareTo(other.lastname);
        int firstnameVal = firstname.compareTo(other.firstname);
        if (lastnameVal == 0)
            return firstnameVal;
        return lastnameVal;
    }
}
