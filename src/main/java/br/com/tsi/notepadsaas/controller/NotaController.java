package br.com.tsi.notepadsaas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tsi.model.Nota;
import br.com.tsi.notepadsaas.repository.NotaRepository;

@RestController
public class NotaController {

	private NotaRepository noteRepository;
	
	public NotaController(NotaRepository noteRepository) {
		this.noteRepository = noteRepository;
	}
	
	@GetMapping( value = "/" )
	public List<Nota> findAll() {
		return noteRepository.findAll();
	}
	
	@PostMapping( value = "/" )
	public void save(@RequestBody Nota nota) {
		noteRepository.save(nota);
	}
}
