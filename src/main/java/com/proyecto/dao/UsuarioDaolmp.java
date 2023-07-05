package com.proyecto.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyecto.Entity.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class UsuarioDaolmp implements UsuarioDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Usuario> obetenerUsuarios() {
		String query="from Usuario";
		return entityManager.createQuery(query).getResultList();
		
	}

}
