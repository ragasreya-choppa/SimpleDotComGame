package com.basics;/*class SimpleDotCom
{
    int[] locationCells ;
    int numOfHits=0;

    public void setLocationCells(int[] locs)
    {
        locationCells=locs;
    }

    public String checkYourself(String stringGuess)
    {
        String userGuess="2";
        int guess = Integer.parseInt(userGuess);
        String result="miss";
        for(int cell : locationCells)
        {
            if(guess==cell)
            {
                result="hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits==locationCells.length)
        {
            result="kill";
        }

        System.out.println(result);
        return result;
    }
}


public class com.basics.SimpleDotComTestDrive
{
    public static void main(String args[])
    {
        SimpleDotCom dot= new SimpleDotCom();

        int[] locations = {1,2,3};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result=dot.checkYourself(userGuess);
    }
} */

import java.util.Scanner;
class SimpleDotComTestDrive
{
    public static void main(String args[]) {
        int numOfHits = 0;
        int userGuess=0;

        String dotComBoard[] = new String[8];

        String positionFour = "c";
        String positionFive = "o";
        String positionSix = "m";

        dotComBoard[4] = positionFour;
        dotComBoard[5] = positionFive;
        dotComBoard[6] = positionSix;

        Scanner sc = new Scanner(System.in);


        while (numOfHits < 3 )
        {
            System.out.println("Enter Your Position between 0 to 7 : ");
            int userInput = sc.nextInt();
            if (dotComBoard[userInput] != null)
            {
                System.out.println("Hit");
                numOfHits++;
            }
           else
           {
               System.out.println("Miss");
               // numOfHits = 0;
           }

           userGuess++;

           //numOfHits = numOfHits + 1;

        }

        //System.out.println("No of Guesses : " + userGuess);
        //System.out.println("You Took " + numOfHits + " Guesses");
        //System.out.println("kill");

        System.out.println(" You took:  " + userGuess + " guesses ");
        System.out.println("kill");


    }
}
