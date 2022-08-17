package com.company.Objects;

public class Task1 {
/*You decide to recall the happy days of your childhood and play Heroes.
 Of course, you need the army
Your task is to create objects: 5 Unit, 3 Knight, 1 General, 1 Doctor.*/
public static void createArmy() {
    new Unit("Bob");
    new Unit("Bd");
    new Unit("Bo");
    new Unit("Bb");
    new Unit("Bobet");
    new Knight("Tom");
    new Knight("Tm");
    new Knight("Tomr");
    new General("fff");
    new Doctor("ee");
}

    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
