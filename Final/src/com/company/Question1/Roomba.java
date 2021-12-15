package com.company.Question1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Roomba implements iRobot {

        int ROOM_SIZE = 5;
        int[][] room = new int[ROOM_SIZE][ROOM_SIZE];
        int[] currentPosition = {0,0};

        Direction currentDirection = Direction.DOWN;

        @Override
        public boolean move() {
            int i = currentPosition[0];
            int j = currentPosition[1];

            switch (currentDirection) {
                case UP:
                    if(! (j-1 >= 0 && room[i][j-1]!=-1))
                        return false;
                case DOWN:
                    if (! (j+1 < ROOM_SIZE && room[i][j+1] != -1))
                        return false;
                case LEFT:
                    if (! (i-1 >= 0 && room[i-1][j] != -1))
                        return false;
                case RIGHT:
                    if (! (i+1 < ROOM_SIZE && room[i+1][j] != -1))
                        return false;
            }
            return true;
        }

        @Override
        public void turnLeft() {
            Map<Direction, Direction> leftTurns = new HashMap<>();
            leftTurns.put(Direction.DOWN, Direction.RIGHT);
            leftTurns.put(Direction.RIGHT, Direction.UP);
            leftTurns.put(Direction.UP, Direction.LEFT);
            leftTurns.put(Direction.LEFT, Direction.DOWN);

            currentDirection = leftTurns.get(currentDirection);
        }

        @Override
        public void turnRight() {
            Map<Direction, Direction> rightTurns = new HashMap<>();
            rightTurns.put(Direction.DOWN, Direction.LEFT);
            rightTurns.put(Direction.LEFT, Direction.UP);
            rightTurns.put(Direction.UP, Direction.RIGHT);
            rightTurns.put(Direction.RIGHT, Direction.DOWN);

            currentDirection = rightTurns.get(currentDirection);
        }

        @Override
        public void clean() {
            room[currentPosition[0]][currentPosition[1]] = 1;
        }

        public void randomInitializeRoom() {
            Random r = new Random();
            for(int row=0;row <ROOM_SIZE; row++) {
                for(int col=0; col<ROOM_SIZE; col++) {
                    room[row][col] = r.nextInt(1) * -1;
                }
//            System.out.println();
            }
        }

        public void printRoom() {
            for(int row=0;row <ROOM_SIZE; row++) {
                for(int col=0; col<ROOM_SIZE; col++) {
                    System.out.print(room[row][col] + " ");
                }
                System.out.println();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Roomba currentPosition : ({}.{})\n", currentPosition[0], currentPosition[1]));
            sb.append(String.format("Roomba currentDirection : {}", currentDirection.toString()));
            return sb.toString();
        }
    }