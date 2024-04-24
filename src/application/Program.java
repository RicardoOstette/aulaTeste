package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Students[] std = new Students [10];		
		
	\\ teste aula sobrescrevendo tudo 

		System.out.print("How MANY will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Rent: #%d%n", i + 1);
			System.out.print("NAME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("EMAIL: ");
			String email = sc.nextLine();
			System.out.print("ROOM: ");
			int room = sc.nextInt();
			std[room - 1] = new Students(name, email, room);
		}
	
	\\ leitura da lista: 
	
		for (int i = 0; i < std.length ; i++) {
			if (vet[i] != null) {
				System.out.println(vet[i]);
			}
		}		
		
		
		sc.close();
	}

}
