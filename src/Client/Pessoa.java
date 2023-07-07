package Client;

import java.util.ArrayList;

import static Client.Skills.*;

public class Pessoa {
    public static String name;
    public static String email;

    public static ArrayList<Double> frontSKillsList = new ArrayList<>();
    public static ArrayList<Double> backSkillsList = new ArrayList<>();

    public Pessoa(String name, String email, ArrayList<Double> backSkillsList, ArrayList<Double> frontSKillsList, String resultado) {
        calculaSkills();
    }
//    public static StringBuilder resultado = new StringBuilder();

    @Override
    public String toString(){
        StringBuilder sbForms = new StringBuilder();
        sbForms.append("nome: " + name);
        sbForms.append("\nEmail: " + email);
        sbForms.append("\nSuas notas em back-end" + backSkillsList);
        sbForms.append("\nSuas notas em front-end" + frontSKillsList);
        sbForms.append("\n" + resultado );

        return sbForms.toString();
    }
}
