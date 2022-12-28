package com.coutech.JavaSpringEvent.events;

import com.coutech.JavaSpringEvent.models.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioAtivadoEvent {

	private Usuario usuario;
	
}
