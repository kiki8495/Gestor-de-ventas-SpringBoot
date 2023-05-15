package com.university.gestorventas;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.university.gestorventas.view.GUIrunner;

import javafx.application.Application;

@SpringBootApplication
public class GestorVentasApplication {

	public static void main(String[] args) {
		Application.launch(GUIrunner.class, args);
	}

}