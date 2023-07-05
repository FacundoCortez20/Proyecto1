package com.proyecto.controller;

import java.util.List;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.Entity.Usuario;
import com.proyecto.dao.UsuarioDao;

@RestController
	public class UsuarioController {
	@RequestMapping (value="mensaje")
	public String mensaje() {
		
		return "mensaje";
	}
	@RequestMapping (value="persona")
	public List<String> listarPersonas(){
		return List.of("facundo", "Tomas");
		
	}
	@RequestMapping (value="Usuario")
	public Usuario listarUsuario() {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Facundo");
		usuario.setApellido("Cortez");
		usuario.setTelefono("261256247");
		usuario.setEmail("facundocortezroa@gmail.com");
		
		
		return usuario;
	}
	@RequestMapping (value="Usuarios/{id}")
	public Usuario getUsuario(@PathVariable long id ) {
		
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Facundo");
		usuario.setApellido("Cortez");
		usuario.setTelefono("261256247");
		usuario.setEmail("facundocortezroa@gmail.com");
		
		
		return usuario;
	}
	
	@RequestMapping (value="Usuarios/listausuarios")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1 = new Usuario();
		usuario1.setId(2l);
		usuario1.setNombre("Facundo");
		usuario1.setApellido("Cortez");
		usuario1.setTelefono("261256247");
		usuario1.setEmail("facundocortezroa@gmail.com");
		
		
		Usuario usuario2 = new Usuario();
		usuario2.setId(3L);
		usuario2.setNombre("Tomas");
		usuario2.setApellido("Roa");
		usuario2.setTelefono("261257410");
		usuario2.setEmail("Tomasroa@gmail.com");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		return usuarios;
	}
	@RequestMapping (value="api/usuarios")
	public List<Usuario> getUsuario(){
		
		List<Usuario> user=UsuarioDao.obtenerUsuarios();
		return user;
	}

}