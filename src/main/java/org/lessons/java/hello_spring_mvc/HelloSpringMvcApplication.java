package org.lessons.java.hello_spring_mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringMvcApplication.class, args);
	}

}

/*
 * Come visto insieme a lezione iniziamo un nuovo progetto Spring MVC e lo
 * eseguiamo testandone le capacità di esecuzione.
 * 
 * Proviamo a creare un Controller a piacere, che gestisca più rotte oltre a
 * quella iniziale, ognuna che restituisca una pagina html differente presa
 * dalla cartella templates, proprio come abbiamo visto a lezione!
 * 
 * Buon lavoro a tutte e a tutti!
 */