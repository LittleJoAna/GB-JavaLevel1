package Lesson_5;

public class HomeWork {
    /*
    1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
    2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу
    передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
    прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
    4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат:
     'Пёсик пробежал!')
    5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
     */
    public static void main(String[] args) {
        Animals dog = new Dogs("Пес Бобик", "рыжий", 4);
        Animals cat = new Cats("Кот Мурзик", "белый", 2);
        Animals horse = new Horses("Конь Красавчик", "серый в яблоках", 7);
        Animals bird = new Birds("Птица Кеша", "мультиколор", 1);
        System.out.println("Впервые в мире! Забег животных! \nУчаствуют: ");
        Animals[] animals = {dog, cat, horse, bird};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
        }
        int runLength = 800;
        System.out.println("\nПервое испытание: забег на " + runLength + " метров!\nИтак, сейчас мы узнаем, кто же выдержал это испытание: ");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + (animals[i].run(runLength) ? "" : " не") + " пробежал!");
        }
        float jumpLength = 0.3f;
        System.out.println("\nВторое испытание: прыжок на " + jumpLength + " метров!\nИтак, сейчас мы узнаем, кто же выдержал это испытание: ");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + (animals[i].jump(jumpLength) ? "" : " не") + " прыгнул!");
        }
        int swimLength = 50;
        System.out.println("\nТретье испытание: заплыв на " + swimLength + " метров!\nИтак, сейчас мы узнаем, кто же выдержал это испытание: ");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + (animals[i].swim(swimLength) ? "" : " не") + " проплыл!");
        }
    }
}
