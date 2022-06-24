package com.JANA60.registrazione.controller.main;

import com.JANA60.registrazione.model.entities.*;
import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) 
	{
		/*
		 * Creare una classe Registrazione con metodo main in cui, tramite Scanner, 
		 * vengono chieste le informazioni all’utente e si prova a creare un nuovo oggetto Utente.
			Gestire tramite try e catch eventuali errori in fase di creazione 
			in modo che il programma non si interrompa bruscamente ma chieda all’utente di inserire dei dati corretti.
		
		 */
		
		Scanner keyboard = new Scanner (System.in);
		String repeat;
		
		do
		{
			
			System.out.println("Benvenuto");
			
			try
			{
				System.out.println("Inserisca il suo nome: ");
				String name = keyboard.nextLine();
				System.out.println("Inserisca il suo nome: ");
				String surname = keyboard.nextLine();
				System.out.println("Inserisca il suo nome: ");
				int age = Integer.parseInt(keyboard.nextLine());
				System.out.println("Inserisca il suo nome: ");
				String email = keyboard.nextLine();
				System.out.println("Inserisca il suo nome: ");
				String password = keyboard.nextLine();
				
				User utente = new User(name, surname, email, password, age);
				System.out.println(utente.toString());
				
			}
			catch(Exception e)
			{
				System.out.println("Impossibile creare il biglietto");
			      System.out.println(e.getMessage());
			}
			finally
			{
				do
				{
					System.out.println("Vuoi registrare un nuovo utente?");
					
					repeat=keyboard.nextLine();
					
					if(!repeat.equalsIgnoreCase("si") && !repeat.equalsIgnoreCase("no"))
						System.out.println("Input errato, riprova.");
					
				}while(!repeat.equalsIgnoreCase("si") && !repeat.equalsIgnoreCase("no"));	
			}
						
		}while(repeat.equalsIgnoreCase("si"));
		
		System.out.println("Grazie e arrivederci.");
		
		
		keyboard.close();
	}

}
