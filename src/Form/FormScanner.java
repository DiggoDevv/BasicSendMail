package form;

import client.Client;

import java.util.Scanner;
import static client.Client.*;

import static client.Skills.*;


public class FormScanner {
    public static Scanner scanner = new Scanner(System.in);

    public static void formScanner() {

        System.out.println("Avaliação de Habilidades em Programação");
        System.out.println("--------------------------------------");

        System.out.print("Digite o nome do candidato: ");
        name = scanner.nextLine();
//        validateName(name);



        System.out.print("Digite o email do candidato: ");
        email = scanner.nextLine();
//        validateEmail(email);

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

        calculaNota();

//        System.out.println(backEnd);
//        System.out.println(frontEnd);
//        System.out.println(frontSKillsList);
//        System.out.println(backSkillsList);

    }
    public static void imprimirDados(){
        Client form = new Client(name, email, backSkillsList, frontSKillsList, resultado);
        System.out.println(form);
    }
}
