package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Students[] vet = new Students [10];		
		
		System.out.print("How many will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Rent: #%d%n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vet[room - 1] = new Students(name, email, room);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < vet.length ; i++) {
			if (vet[i] != null) {
				System.out.println(vet[i]);
			}
		}
		
		
		sc.close();
	}

}
