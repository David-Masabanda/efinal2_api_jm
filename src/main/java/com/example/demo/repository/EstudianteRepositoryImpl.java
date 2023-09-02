package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void guardarEstudiante(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarCedula(String cedula) {
		TypedQuery<Estudiante> myQuery=this.entityManager.createQuery(
				"SELECT e FROM Estudiante e WHERE e.cedula=:datoCedula", Estudiante.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarTodos() {
		TypedQuery<Estudiante> myQuery=this.entityManager.createQuery(
				"SELECT e FROM Estudiante e", Estudiante.class);		
		return myQuery.getResultList();
	}

}
