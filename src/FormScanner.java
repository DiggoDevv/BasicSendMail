import skills.Skills;

import java.util.ArrayList;
import java.util.Scanner;
import skills.Skills;

import static skills.Skills.*;


public class FormScanner{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Avaliação de Habilidades em Programação");
        System.out.println("--------------------------------------");

        System.out.print("Digite o nome do candidato: ");
        String name = scanner.nextLine();


        System.out.print("Digite o email do candidato: ");
        String email = scanner.nextLine();

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


        scanner.close();
//        if (backSkillsList.) {
//            System.out.println("Parabéns, " + nome + "! Você foi certificado como desenvolvedor back-end.");
//        } else if (notaVue > 7 && notaJavaScript > 7 && notaPHP > 7) {
//            System.out.println("Parabéns, " + nome + "! Você foi certificado como desenvolvedor front-end.");
//        } else {
//            System.out.println("Desculpe, " + nome + ". Você não atingiu a nota mínima para a certificação.");
//        }
//
    }
}
