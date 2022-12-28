package com.coutech.JavaSpringEvent.services;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.coutech.JavaSpringEvent.events.UsuarioAtivadoEvent;
import com.coutech.JavaSpringEvent.models.Usuario;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EventService {

	private final ApplicationEventPublisher eventPublisher;

	public Usuario startEvent(Usuario usuario) {
		usuario = EventService.ativaUsuario(usuario);
		eventPublisher.publishEvent(new UsuarioAtivadoEvent(usuario));
		return usuario;
	}

	private static Usuario ativaUsuario(Usuario usuario) {
		usuario.setStatus(Boolean.TRUE);
		return usuario;
	}

}
