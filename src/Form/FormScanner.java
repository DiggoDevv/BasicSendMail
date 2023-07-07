package form;

import Client.Pessoa;
import Client.Skills;

import java.text.Normalizer;
import java.util.Scanner;
import static Client.Pessoa.*;

import static Client.Skills.*;


public class FormScanner {
    public static Scanner scanner = new Scanner(System.in);

    public static void formScanner() {

        System.out.println("Avaliação de Habilidades em Programação");
        System.out.println("--------------------------------------");

        System.out.print("Digite o nome do candidato: ");
        name = scanner.nextLine();

        System.out.print("Digite o email do candidato: ");
        email = scanner.nextLine();

        System.out.println("Digite as notas nas linguagens de programação:");
        System.out.print("Java: ");
        backSkillsList.add(scanner.nextDouble());
        System.out.println("C#");
        backSkillsList.add(scanner.nextDouble());
        System.out.println("Golang");
        backSkillsList.add(scanner.nextDouble());

        System.out.println("JavaScript");
        frontSKillsList.add(scanner.nextDouble());
        System.out.println("Vue");
        frontSKillsList.add(scanner.nextDouble());
        System.out.println("PHP");
        frontSKillsList.add(scanner.nextDouble());

        for (double nota : backSkillsList) {
            if (nota >= 7.0) {
                backEnd = true;
            }
        }
        for (double nota : frontSKillsList) {
            if (nota >= 7.0) {
                frontEnd = true;
            }
        }
        System.out.println(backEnd);
        System.out.println(frontEnd);
        System.out.println(frontSKillsList);
        System.out.println(backSkillsList);

//        if (fullstack) {
//            resultado.append("Parabens voce foi classificado como desenvolvedor fullstack");
//        } else if (frontEnd) {
//            resultado.append("Parabens voce foi classificado como desenvolvedor frontEnd");
//        } else if (backEnd) {
//            resultado.append("Parabens voce foi classificado como desenvolvedor BackEnd");
//        } else {
//            resultado.append("Infelizmente voce não atingiu a nota para classificação :(");
//        }
    }
    public static void imprimirDados(){
        Pessoa form = new Pessoa(name, email, backSkillsList, frontSKillsList, resultado);
        System.out.println(form);
    }
}
