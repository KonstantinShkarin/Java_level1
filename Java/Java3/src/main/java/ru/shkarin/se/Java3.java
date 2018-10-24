package ru.shkarin.se;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Shkarin Konstantin
 *
 */
public class Java3 {
    
    public static void main(String[] args) {
        truWin();
    }
    public  static void truWin(){
        int value = 0; // введенное с клавиатуры значение
        Random rn = new Random();
        int rand = rn.nextInt(9);
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9 с трех попыток!");

        for (int i = 0; i<3; i++){
            System.out.println("Ваше число:");
            value = sc.nextInt();
            if (rand == value){
                System.out.println("Вы угадали!");
                break;
            } else if (rand>value){
                System.out.println("Загаданное число больше введенного.");
            } else System.out.println("Загаданное число меньше введенного.");
        }
        if(rand !=value){
            System.out.println("Вы проиграли :(");
        }
        System.out.println("Играем дальше? 1- да, 0 - нет");
        int cont = sc.nextInt();
        switch (cont){
            case 0:
                break;
            case 1:
                truWin();
        }
        sc.close();
    }
}



