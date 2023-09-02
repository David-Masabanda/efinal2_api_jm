package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void guardarEstudiante(Estudiante estudiante) {

		this.estudianteRepository.guardarEstudiante(estudiante);
	}

	@Override
	public Estudiante buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository
				.buscarCedula(cedula);
	}

	@Override
	public List<Estudiante> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarTodos();
	}

}
