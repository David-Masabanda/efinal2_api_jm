package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
	
	public void guardarEstudiante(Estudiante estudiante);
	
	public Estudiante buscarCedula(String cedula);
	
	public List<Estudiante> buscarTodos();


	
}
