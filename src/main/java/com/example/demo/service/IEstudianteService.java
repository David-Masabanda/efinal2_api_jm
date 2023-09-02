package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {
	
	public void guardarEstudiante(Estudiante estudiante);

	public Estudiante buscarCedula(String cedula);

	public List<Estudiante> buscarTodos();

}
