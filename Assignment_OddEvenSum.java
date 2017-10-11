package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int startPoint = 2;
        int endPoint = 100;
        int oddSum = 0;
        int evenSum = 0;
        int oddCube = 0;
        double evenCube = 0;
        double oddCubeSum = 0;
        double evenCubeSum = 0;

        for (int i = startPoint; i <= endPoint; i = i + 2) {
            oddSum = oddSum + (i - 1);
            oddCube = (i - 1) * (i - 1) * (i - 1);
            oddCubeSum = oddCubeSum + oddCube;
            //oddCube = Math.pow(i-1, 3);
            System.out.println("The cube of this odd no = " + oddCube);

            evenSum = evenSum + i;
            evenCube = i * i * i;
            evenCubeSum = evenCubeSum + evenCube;
            //evenCube = Math.pow(i, 3);
            System.out.println("The cube of this even no = " + evenCube);
        }
        System.out.println("=========================================================");

        System.out.println("The sum of all the even cubes = " + evenCubeSum);
        System.out.println("The sum of all the odd cubes = " + oddCubeSum);
        System.out.println("The sum of the odd nos from 0 - 100 = " + oddSum);
        System.out.println("The sum of all even nos from 0 - 100 = " + evenSum);

    }
}
