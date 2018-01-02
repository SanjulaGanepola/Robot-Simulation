/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import becker.robots.*;
import java.awt.Color;

public class Robot1 {

    public static void main(String[] args) {
        City waterloo = new City();

        Robot red = new Robot(waterloo, 3, 0, Direction.EAST, 0);

        Robot yellow = new Robot(waterloo, 3, 6, Direction.WEST, 0);

        yellow.setColor(Color.yellow);
        for (int i = 0; i < 3; i++) {
            red.move();
            yellow.move();
        }
    }
}
