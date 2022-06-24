package com.JANA60.registrazione.model.entities;

public class User 
{
	/*
	 * Creare una classe Utente con attributi nome, cognome, email, password ed età.
		Aggiungere un costruttore con parametri e metodi getter e setter.
		Implementare dei metodi di validazione in modo che:
		- email contenga un carattere @ e un .
		- password sia lunga tra 8 e 12 caratteri
		- età sia maggiore di 18 anni
		In caso i parametri non siano validi, impedire che vengano valorizzati gli attributi nei metodi e nel costruttore, sollevando opportune eccezioni.
	 */
	private static final int ADULT = 18, MATUSA = 120, MIN_PASS = 8, MAX_PASS= 12;
	
	
	
	
	private String name, surname, email, password;
	private int age;
	private int atChar=0;
	private int ptChar=0;
	
	
	public User(String name, String surname, String email, String password, int age) throws Exception
	{
		
		super();
		
		//metodo di controllo della mail
		checkEmail(email);
		
		//condizioni di eccezione
		//controllo nome
		if (name==null || name.isBlank())
		{
			throw new Exception ("Il campo del nome non può essere vuoto");
		}
		
		//controllo cognome
		if (surname==null || surname.isBlank())
		{
			throw new Exception ("Il campo del cognome non può essere vuoto");
		}
		
		//controllo password
		if (password.length() < MIN_PASS && password.length() > MAX_PASS)
		{
			throw new Exception ("La password può essere lunga minimo 8 e massimo 12 caratteri");
		}
		
		//controllo età
		if (age< ADULT && age>= MATUSA)
		{
			throw new Exception ("La registrazione non può avvenire per utenti con età minore di 18 e maggiore di 120");
		}
		
		//controllo mail
		if(atChar ==0)
		{
			throw new Exception ("L'indirizzo mail deve contenere per forza il carattere @");
		}
		
		if(ptChar ==0)
		{
			throw new Exception ("L'indirizzo mail deve contenere per forza il carattere .");
		}
		
		if(atChar>1)
		{
			throw new Exception ("L'indirizzo mail può contenere solo un carattere @");
		}
		
		if(ptChar>1)
		{
			throw new Exception ("L'indirizzo mail può contenere solo un carattere .");
		}
		
		//creazione oggetto
		this.name = name;		
		this.surname = surname;		
		this.email = email;		
		this.password = password;		
		this.age = age;
	}

	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
	
	
	
	//metodi di oggetto
	public void checkEmail(String email)
	{
		
		
		if (email.contains("@"))
			atChar++;
		
		if(email.contains("."))
			ptChar++;
		
	}
	
	public String toString()
	{
		return 	"Nuovo utente:"		+
				name				+
				" "					+
				surname				+	
				" età: "			+
				age					+
				" email: "			+
				email				+
				" password: "		+
				password			+
				". \n Benvenuto!"	;
				
	}
}
