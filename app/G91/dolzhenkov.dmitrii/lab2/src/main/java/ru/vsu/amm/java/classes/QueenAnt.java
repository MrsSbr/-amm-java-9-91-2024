package ru.vsu.amm.java.classes;

public class QueenAnt extends AbstractAnt {

    private int countLarvaes = 0;

    public QueenAnt(String name, int age, int countLarvaes) {
        super(name, age);
        this.countLarvaes = countLarvaes;
    }

    @Override
    public void work() {
        System.out.println(name + " царствует в муравейнике.");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && countLarvaes == ((QueenAnt) obj).countLarvaes;
    }

    public void makeLarvae() {
        countLarvaes++;
        System.out.println(name + " снесла личинки.");
    }
}