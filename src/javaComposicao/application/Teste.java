package javaComposicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javaComposicao.model.entities.Client;
import javaComposicao.model.entities.Order;
import javaComposicao.model.entities.OrderItem;
import javaComposicao.model.entities.Product;
import javaComposicao.model.enuns.OrderStatus;

public class Teste {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = leia.nextLine().trim();

		System.out.print("Email: ");
		String email = leia.next().trim();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = dateFormat.parse(leia.next().trim());
		leia.close();
	}

}