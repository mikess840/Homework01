public class Cat {
    private final boolean happy;
    private int age;
    private String name;

    public Cat(int age, String name, boolean happy) {
        this.age = age;
        this.name = name;
        this.happy = happy;
    }

    void howOldCat() {
        if (age >= 6) {
            System.out.println("Пожилой кот :( ");
        } else if (age <= 1) {
                System.out.println("Котенок");
            } else {
            System.out.println("Взрослый кот :)");
        }
    }
    void sayName() {
        System.out.println("Имя котенка " + name + ". Возраст " + age + " год/лет.");
    }

    void isHappy() {
        if (happy) {
            System.out.println("Кот веселый");
        } else {
            System.out.println("Кот приуныл, покорми :) ");
        }
    }

}
