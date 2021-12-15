package com.company.Question1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] room = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {-1, 0, 0, 0},
                {0, 0, -1, 0}
        };
        //        Roomba r = new Roomba(5);
//        r.randomInitializeRoom();
//        r.printRoom();
//
//        while(true) {
//            System.out.println(r);
//            r.printRoom();
//            System.out.println("Current Action ? c:1, m:2, l:3, r:4");
//
//
//            Scanner reader = new Scanner(System.in);
//
//            switch (reader.nextInt()) {
//                case 1:
//                    r.clean();
//                    break;
//                case 2:
//                    if(r.move()) {
//                        System.out.println("succesfully moved forward");
//                    }
//                    else {
//                        System.out.println("could not move, rotate or stuck");
//                    }
//                    break;
//                case 3:
//                    r.turnLeft();
//                    break;
//                case 4:
//                    r.turnRight();
//                    break;
//            }
//        }
//    }
    }
}
