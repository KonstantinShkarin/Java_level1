/**
 * Java 1 Lesson 5 homework Person
 *
 * @author Konstantin Shkarin
 * @version date Dec 03, 2018
 *
 */

package Lesson5;

public class Person {
    private String name;
    private String position;
    private String email;

    private String phoneNumber;
    private String salary;
    private String age;

    public Person(String name, String position, String email, String phoneNumber, String salary, String age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return name + " " + position + " " + email + " " + phoneNumber + " " + salary + " " + age;
    }

    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Ivanov Ivan Sergeevich", "Manager", "ivanovIS@mail.ru", "89156878963", "35000", "50");
        person[1] = new Person("Petrov Dmitry Ivanovoch", "Junior programmer", "PetrovDI@mail.ru", "89159687478", "25000", "23");
        person[2] = new Person("Vasin Peter Leonidovich", "Expert programmer", "VasinPL@mail.ru", "89166823573", "60000", "45");
        person[3] = new Person("Kamova Svetlana Igorevna","Reception","KamovaSI@mail.ru","89166825763", "20000","44");

        for (int i = 0; i < person.length;i++){
            try {
                int age4 = Integer.parseInt(person[i].age);
                if (age4 > 40) System.out.println(person[i].toString());
            } catch (NullPointerException e) {};
        }
    }
}
