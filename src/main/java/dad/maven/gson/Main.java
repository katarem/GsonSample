package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class Main {
    public static void main(String[] args) {
        String n, a;
        int edad;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca nombre:");
        n = s.nextLine();
        System.out.println("Introduzca apelido:");
        a = s.nextLine();
        System.out.println("Introduzca edad:");
        edad = s.nextInt();
        Persona p = new Persona(n, a, edad);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(p));
        s.close();
    }
}