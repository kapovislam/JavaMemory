import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;

public class Main {
    //Задание 1
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
    }


    private static void changePerson(Person person) {
//        person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";

    }



}