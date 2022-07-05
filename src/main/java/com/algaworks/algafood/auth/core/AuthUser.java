package com.algaworks.algafood.auth.core;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;

import com.algaworks.algafood.auth.domain.Usuario;

import lombok.Getter;

@Getter
public class AuthUser extends User {

	private static final long serialVersionUID = 1L;
	
	private Long codUsuario;
	private String nomeCompleto;
	
	public AuthUser(Usuario usuario) {
		super(usuario.getEmail(), usuario.getSenha(), Collections.emptyList());
		
		this.codUsuario = usuario.getCodigo();
		this.nomeCompleto = usuario.getNome();
	}
	
}
