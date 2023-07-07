package Client;

import form.FormScanner;

import java.util.ArrayList;

import static Client.Pessoa.backSkillsList;
import static Client.Pessoa.frontSKillsList;


public class Skills {
    public static boolean frontEnd;
    public static boolean backEnd;
    public static boolean fullstack;

    public static String resultado;

    public static String calculaSkills() {
        if (fullstack = backEnd && frontEnd) {
            return resultado = "Parabens voce foi classificado como desenvolvedor fullstack";
        } else if (frontEnd) {
            return resultado = "Parabens voce foi classificado como desenvolvedor FrontEnd";
        } else if (backEnd) {
            return resultado = "Parabens voce foi classificado como desenvolvedor BackEnd";
        } else {
            return resultado = "Infelizmente voce não atingiu a nota para classificação :(";
        }
        // static é usado para que o array, seja visivel no MAIN
    }
}
