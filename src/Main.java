public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 31;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int outsideTemperature = 8;
        if (outsideTemperature < 5) {
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 70;
        int maxSpeed = 60;
        if (speed > maxSpeed) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int agePerson = 19;
        boolean ageForKindergarten = agePerson >= 2 && agePerson <= 6;
        boolean ageForSchool = agePerson >= 7 && agePerson <= 18;
        boolean ageForUniversity = agePerson > 18 && agePerson <= 24;
        boolean ageForWork = agePerson >= 24;
        if (ageForKindergarten) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
        } else if (ageForSchool) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        } else if (ageForUniversity) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет");
        } else if (ageForWork) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу");
        }
            System.out.println("Задача 5");
            int childAge =  10;
            boolean age1 = childAge < 5;
            boolean age2 = childAge >= 5 && childAge < 14;
            boolean age3 = childAge > 14;
            if (age1) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
            } else if (age2) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else if (age3) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
                System.out.println("Задача 6");
            int carriageCapacity = 102;
            int seatPlaces = 60;
            int standPlaces = carriageCapacity - seatPlaces;
            int peopleInCarriage = 103;
            boolean personOnSeatPlace = peopleInCarriage <= seatPlaces;
            boolean personOnStandPlace = peopleInCarriage > seatPlaces && peopleInCarriage <= carriageCapacity;
            boolean personNoPlaces = peopleInCarriage > carriageCapacity;
            if (personOnSeatPlace) {
                System.out.println("В вагоне " + peopleInCarriage + " человек. Есть сидячие места");
            } else if (personOnStandPlace) {
                System.out.println("В вагоне " + peopleInCarriage + " человек. Остались только стоячие места");
            } else if (personNoPlaces) {
                System.out.println("В вагоне помещается максимум " + carriageCapacity + " человека. Вагон полностью забит");
            }
                System.out.println("Задача 7");
            int one = 12;
            int two = 42;
            int three = 56;
            if (one > two && one > three) {
                System.out.println("Самое большое число: " + one);
            } else if ( two > one && two > three) {
                System.out.println("Самое большое число: " + two);
            } else {
                System.out.println("Самое большое число: " + three);
            }

    }
 }
