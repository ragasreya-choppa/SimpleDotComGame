package com.basics;

import java.util.ArrayList;
import java.util.Scanner;

class SimpleDotComArrayListOwn
{
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<String>(7);
        al.add(0,null);
        al.add(1,null);
        al.add(2,null);
        al.add(3,null);
        al.add(4,"c");
        al.add(5,"o");
        al.add(6,"m");
        al.add(7,null);


        ArrayList<Integer> userInputsArray = new ArrayList<Integer>(7);
        userInputsArray.add(0,null);
        userInputsArray.add(1,null);
        userInputsArray.add(2,null);
        userInputsArray.add(3,null);
        userInputsArray.add(4,null);
        userInputsArray.add(5,null);
        userInputsArray.add(6,null);
        userInputsArray.add(7,null);




        //System.out.println(al);
        //System.out.println(userInputsArray);

        int numOfHits = 0;
        int userGuesses = 0;
        int userInput = 0;

        Scanner sc = new Scanner(System.in);

        while(numOfHits < 3)
        {
            System.out.println("Enter Your position between 0 to 7 ");
            userInput = sc.nextInt();

            if(userInputsArray.contains(userInput))
            {
                System.out.println("You have entered a repeated value !");
                userGuesses++;
                continue;
            }


            if(al.get(userInput) != null)
            {
                System.out.println("Hit");
                //System.out.println("Current User Input is : " + userInput);
                userInputsArray.set(userInput,userInput);
                //System.out.println("Current user input array is : " + userInputsArray);
                numOfHits++;
                userGuesses++;
            }
            else
            {
                System.out.println("Miss");
                userGuesses++;
            }


            //userGuesses++;


        }


        System.out.println("You Took " + userGuesses + " guesses ");
        System.out.println("kill");



    }
}