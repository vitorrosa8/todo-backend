package com.vitor.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.todo.domain.Todo;
import com.vitor.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;
 
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Prova PW2 - EJBS", sdf.parse("25/08/2022"), false);
		Todo t2 = new Todo(null, "Ler", "Ler livro Uma Biografia Da Depressão", sdf.parse("22/08/2021"), true);
		Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", sdf.parse("19/08/2022"), false);
		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", sdf.parse("19/08/2021"), true);
		Todo t5 = new Todo(null, "Correr", "Correr 20 kilometros ", sdf.parse("27/09/2021"), false);
		Todo t6 = new Todo(null, "Trabalho", "Trabalho da faculdade para apresentar fazer vídeo", sdf.parse("20/08/2021"), false);
	    

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	} 
	
}
 