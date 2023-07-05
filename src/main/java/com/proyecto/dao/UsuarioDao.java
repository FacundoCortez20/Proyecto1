package com.proyecto.dao;

import java.util.List;

import com.proyecto.Entity.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	List<Usuario> obetenerUsuarios();

	static List<Usuario> obtenerUsuarios() {
		
		return null;
	}

}
