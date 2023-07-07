package client;

import java.util.ArrayList;

import static client.Skills.calculaSkills;
import static client.Skills.resultado;

public class Client {
    public static String name;
    public static String email;

    public static ArrayList<Double> frontSKillsList = new ArrayList<>();
    public static ArrayList<Double> backSkillsList = new ArrayList<>();

    public Client(String name, String email, ArrayList<Double> backSkillsList, ArrayList<Double> frontSKillsList, String resultado) {
        calculaSkills();
    }
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

    //validações

//    public static String validateEmail(String email) {
//        if ( email == null || email.isEmpty()) {
//            return "Email-invalido";
//        }
//        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
//        Pattern pattern = Pattern.compile(emailRegex);
//        if (pattern.matcher(email).matches()) {
//            return "Email válido";
//        } else {
//            return "Email Invalido";
//        }
//    }
//    public static String validateName(String name){
//        if ( name == null || name.isEmpty()){
//            return "Nome-invalido";
//        }
//        String nomeRegex = "[A-Za-zÀ-ÿ]+(?:\\\\s[A-Za-zÀ-ÿ]+)*$";
//        Pattern pattern = Pattern.compile(nomeRegex);
//        if(pattern.matcher(nomeRegex).matches()) {
//            return "nome válido";
//        } else {
//            return "nome invalido";
//        }
//    }
}

