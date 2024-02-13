package application;

import application.SubSystem.Facade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //il main (client) non può accedere alle classi del sottosistem
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
        String binaryString = Facade.getInstance().convertToBinary(input);
        System.out.println("Stringa in binario: "+binaryString);
        String hexString = Facade.getInstance().convertToHex(input);
        System.out.println("Stringa in esadecimale: "+hexString);

    }
}