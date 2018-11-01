package Lesson_4;

public class Employees {
    /*
        1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
        2. Конструктор класса должен заполнять эти поля при создании объекта;
        3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
        4. Вывести при помощи методов из пункта 3 ФИО и должность.
        5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Метод должен принимать в качестве параметра
    массив сотрудников. Вывести в main() возраст и зарплату сотрудника до и после вызова метода;
        7. ** Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников,
    вывести результаты работы в консоль.
     */
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    Employees(String surname, String name, String patronymic, String position, String phoneNumber, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        String s = getSurname() + " " + getName() + " " + getPatronymic() + ", ";
        return s;
    }
}
