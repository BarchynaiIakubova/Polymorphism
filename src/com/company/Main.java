package com.company;

public class Main {

    public static void main(String[] args) {
	Animal[] animal = {new Shark(), new Turtle(), new Eagle()};
    Shark[] shark = new Shark[5];
    Turtle[] turtle = new Turtle[5];
    Eagle[] eagle = new Eagle[5];

	for (Animal a:animal) {
        if (a instanceof Shark) {
            ((Shark) a).attack();
            shark[0] = new Shark();

        }
            else if (a.getClass().getName().equals("com.company.Turtle")) {
            ((Turtle) a).swim();
            turtle[0] = new Turtle();
        }
            else {
            ((Eagle) a).fly();
            eagle[0] = new Eagle();
        }

    }


    }
}
