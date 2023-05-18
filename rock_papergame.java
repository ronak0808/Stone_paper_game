package com.company;
import java.util.Random;
import java.util.Scanner;
public class rock_papergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Random num =new Random();
        System.out.println("welcome to my rock paper game");
        System.out.println("let me say you..");
        System.out.println("stone=0 ");
        System.out.println("paper=1 ");
        System.out.println("secior=2");
        System.out.println("so let's start the game!");
        System.out.println("enter your choice:");
        int a = sc.nextInt();
        int b = (int)(Math.random()*3);
        for (int j=0 ; j<1 ; j++){
            System.out.println(b); }
            if(a==0 && b ==0 ) {
                System.out.println("no one is winner!try again");
            }
            else if (a==1 && b==1){
                System.out.println("no one is winner!try again");
    }
            else if(a==2 && b==2){
            System.out.println("no one is winner!try again");
            }

            else if(a==1 && b==0 ){
            System.out.println(" congrats you won!! thank you");
            }
            else if(a==0 && b==2) {
            System.out.println(" congrats you won!! thank you");
        }
            else if(a==2 && b==1){
            System.out.println(" congrats you won!! thank you");
            }
            else if(a==2 && b==0){
                System.out.println("you lost! thank you.");
            }
                else if(a==0 && b==1){
                    System.out.println("you lost! thank you.");
                }
                else if(a==1 && b==2){
                    System.out.println("you lost! thank you.");
                }


    }
}
