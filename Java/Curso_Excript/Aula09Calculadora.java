package Curso_Excript;

import java.util.Scanner;

public class Aula09Calculadora {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, n2, sum, sub, mult, div;

        System.out.println("Insira um numero Natural: ");
        n1 = in.nextInt();

        System.out.println("Insira outro  numero Natural: ");
        n2 = in.nextInt();

        /*agora vem as operacoes*/

        sum = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;

        System.out.println("Soma:"+sum+", subtracao:"+sub+",multiplicacao:"+mult+", e divisao:"+div);
    }
}