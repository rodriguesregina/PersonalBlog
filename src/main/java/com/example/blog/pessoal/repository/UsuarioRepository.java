package com.example.blog.pessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.pessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
      public Optional<Usuario> findByUsuario(String usuario);
	
	
	
}