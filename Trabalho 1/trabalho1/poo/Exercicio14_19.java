package trabalho1.poo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;
 
public class Exercicio14_19 {
	
	static Scanner entrada = new Scanner(System.in);
 
    public static void main(String args[]) {
    	
    	System.out.println("Por Favor, insira uma data no seguinte formato (MM/DD/yyyy): ");
    	String data = entrada.nextLine();
 
		Date dataAtual = new Date(data);
        DateFormat dateFormat = new SimpleDateFormat("MMMMMMMMMMMMM dd, yyyy");
        String dataFormatada = dateFormat.format(dataAtual);

		System.out.println("Data formatada ficou: " + dataFormatada);
    }
}