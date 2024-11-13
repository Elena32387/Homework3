import java.awt.*;

public class Main {
    public static void main(String[] args) {

        int age = 40;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то, он не достиг совершеннолетия");
        }

        int weatherToday = 1;
        if (weatherToday < 5) {
            System.out.println("На улице "+weatherToday+ " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице "+weatherToday+ " градусов, можно идти без шапки");
        }

        int speed = 55;
        if (speed>60) {System.out.println("Если скорость "+speed+ " км/ч, то придется заплатить штраф");}
        else  {System.out.println("Если скорость "+speed+ " км/ч, то можно ездить спокойно");}

        int agePeople = 6;
        if (agePeople>=2 && agePeople<=7)
        {System.out.println("Если возраст человека равен "+agePeople+" то ему нужно ходить детский сад");}
        if (agePeople>=7 && agePeople<=17) {System.out.println("Если возраст человека равен "+agePeople+ " то ему нужно ходить в школу");}
        if (agePeople>=18 && agePeople<= 24) {System.out.println("если возраст человека равен"+agePeople+ " то ему нужно ходить в университет" );}
        if (agePeople>24) {System.out.println("Если возраст человека равен "+agePeople+ " то он ходит на работу");}

        int ageChild=6;
        if (ageChild<5) {
            System.out.println("Если возраст ребенка равен "+ageChild+ " то, ему нельзя кататься на аттракционе");}
        if (ageChild>=5 && ageChild<14) {
            System.out.println("Если возраст ребенка равен "+ageChild+ " то, ему можно кататься на аттракционе в сопровождении взрослого");}
        if (ageChild>=14) {
            System.out.println("Если возраст ребенка равен "+ageChild+" то, ему  можно кататься на аттракционе в без сопросождения");}

        int places = 102;
        int sitPlaces = 60;
        int people = 70;
        if (people<=sitPlaces) {
            System.out.println("В вагоне есть сидящие места");}
        if (people >= sitPlaces && people<=places) {
            System.out.println("В вагоне есть стоячие места");}
        if (people>=places) {
            System.out.println( "В вагоне нет свободных мест");}

        int one = 15;
        int two = 3;
        int three = 30;
        if (one>=two && one>=three) {
            System.out.println("Наибольшее число " +one);}
            else if (two>=three) {
                System.out.println("Наибольшее число " +two);}
                else {
                    System.out.println("Наибольшее число " + three);}







    }



    }