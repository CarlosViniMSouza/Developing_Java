package Curso_Excript;

import java.util.Scanner;

public class Aula08Excript {
    public static void main(String[] args) {
        System.out.println("qual a idade do seu dog? :");

        Scanner in = new Scanner(System.in);
        int id_dog = in.nextInt();
        id_dog = id_dog*5;

        System.out.println("Seu dog tem"+ id_dog +"anos em vida humana");
    }
}