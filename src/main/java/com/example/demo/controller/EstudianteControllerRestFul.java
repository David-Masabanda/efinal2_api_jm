package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteControllerRestFul {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	private void ingresarEstudiante(@RequestBody Estudiante estudiante) {
		this.estudianteService.guardarEstudiante(estudiante);
	}
	
	@GetMapping(path = "/{cedula}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Estudiante obtenerUsuario(@PathVariable String cedula) {
		return this.estudianteService.buscarCedula(cedula);
	}
	
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Estudiante> obtenerTodos() {
		return this.estudianteService.buscarTodos();
	}

}
