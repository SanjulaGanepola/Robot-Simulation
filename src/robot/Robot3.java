/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import becker.robots.*;

public class Robot3 {

    public static void main(String[] args) {
        City waterloo = new City();

        Robot bob = new Robot(waterloo, 3, 0, Direction.NORTH, 0);
        bob.setLabel("Bob");

        Wall w1 = new Wall(waterloo, 3, 1, Direction.WEST);
        Wall w2 = new Wall(waterloo, 3, 1, Direction.NORTH);
        Wall w3 = new Wall(waterloo, 3, 2, Direction.NORTH);
        Wall w4 = new Wall(waterloo, 3, 3, Direction.NORTH);
        Wall w5 = new Wall(waterloo, 3, 3, Direction.EAST);
        Wall w6 = new Wall(waterloo, 3, 2, Direction.SOUTH);
        Wall w7 = new Wall(waterloo, 3, 3, Direction.SOUTH);

        Thing t1 = new Thing(waterloo, 2, 1);
        Thing t2 = new Thing(waterloo, 2, 3);
        Thing t3 = new Thing(waterloo, 3, 4);

        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing(t1);
        bob.move();
        bob.move();
        bob.pickThing(t2);
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing(t3);
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.putThing(t1);
        bob.move();
        bob.putThing(t2);
        bob.move();
    }
}
