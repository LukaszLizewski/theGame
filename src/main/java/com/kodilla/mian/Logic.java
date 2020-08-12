package com.kodilla.mian;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Logic {
    private Graphics graphics;
    private List<Integer> listOfIcons;
    private List<Integer> listWorkshopOne;
    private List<Integer> listWorkshopTwo;
    private List<Integer> listWorkshopThree;
    private List<Integer> listWorkshopFour;
    private List<Integer> listWorkshopFive;
    private List<Integer> listWorkshopLast;

    public void start(Graphics graphics) throws Exception {
        this.graphics=graphics;

        List<Integer> listOfIcons = new ArrayList<>();  // baza ikon
        int a = 0;
        for (int i =0; i<5;i++) {
            for (int l = 0; l < 10; l++) {
                listOfIcons.add(a);     //0 - czerwone | 1 - niebieskie | 2 - czerne | 3 - białe | 4 - zółte
            }
            a++;
        }
        this.listOfIcons=listOfIcons;
        List<Integer> listWorkshopOne = new ArrayList<>();
        this.listWorkshopOne=listWorkshopOne;
        List<Integer> listWorkshopTwo = new ArrayList<>();
        this.listWorkshopTwo=listWorkshopTwo;
        List<Integer> listWorkshopThree = new ArrayList<>();
        this.listWorkshopThree=listWorkshopThree;
        List<Integer> listWorkshopFour = new ArrayList<>();
        this.listWorkshopFour=listWorkshopFour;
        List<Integer> listWorkshopFive = new ArrayList<>();
        this.listWorkshopFive=listWorkshopFive;
        List<Integer> listWorkshopLast = new ArrayList<>();
        this.listWorkshopLast=listWorkshopLast;

        graphics.lastWorkshops(0,3,0,0,1);
        /*graphics.lastWorkshops(1,1);

        //graphics.scorePlayer(0 );
        graphics.scoreComputer(0);
        graphics.puzzleOfRowsPlayer();
        graphics.puzzleOfRowsComputer();*/
    }
    public void setWorkshopFirst (boolean set)  throws Exception {
        if (set) {
            Random randomGenerator = new Random();
            for (int m = 1; m <= 5; m++) {
                Integer firs = randomGenerator.nextInt(5);
                Integer second = randomGenerator.nextInt(5);
                Integer third = randomGenerator.nextInt(5);
                Integer fourth = randomGenerator.nextInt(5);
                graphics.workshop(firs, second, third, fourth, m);
                listOfIcons.remove(firs);
                listOfIcons.remove(second);
                listOfIcons.remove(third);
                listOfIcons.remove(fourth);
                if (m == 1) {
                    listWorkshopOne.add(firs);
                    listWorkshopOne.add(second);
                    listWorkshopOne.add(third);
                    listWorkshopOne.add(fourth);
                } else if (m == 2) {
                    listWorkshopTwo.add(firs);
                    listWorkshopTwo.add(second);
                    listWorkshopTwo.add(third);
                    listWorkshopTwo.add(fourth);
                } else if (m == 3) {
                    listWorkshopThree.add(firs);
                    listWorkshopThree.add(second);
                    listWorkshopThree.add(third);
                    listWorkshopThree.add(fourth);
                } else if (m == 4) {
                    listWorkshopFour.add(firs);
                    listWorkshopFour.add(second);
                    listWorkshopFour.add(third);
                    listWorkshopFour.add(fourth);
                } else if (m == 5) {
                    listWorkshopFive.add(firs);
                    listWorkshopFive.add(second);
                    listWorkshopFive.add(third);
                    listWorkshopFive.add(fourth);
                }
            }
            for (Integer list : listOfIcons) {
                System.out.println(list);
            }
            for (Integer one : listWorkshopOne) {
                System.out.println("1: " + one);
            }
            for (Integer two : listWorkshopTwo) {
                System.out.println("2: " + two);
            }
            for (Integer three : listWorkshopThree) {
                System.out.println("3: " + three);
            }
            for (Integer four : listWorkshopFour) {
                System.out.println("4: " + four);
            }
            for (Integer five : listWorkshopFive) {
                System.out.println("5: " + five);
            }
        }
    }
    public void addToList(int i) throws Exception{
        listWorkshopOne.add(i);
        for (Integer list : listWorkshopOne) {
            System.out.println("dodano 1: "+list);
        }

    }
}
