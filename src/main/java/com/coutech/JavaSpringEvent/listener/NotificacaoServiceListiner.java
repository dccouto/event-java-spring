package com.coutech.JavaSpringEvent.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.coutech.JavaSpringEvent.events.UsuarioAtivadoEvent;

@Component
public class NotificacaoServiceListiner {
	
	@EventListener
	public void clienteAtivadoListener(UsuarioAtivadoEvent event) {
		System.out.println("Usuário " + event.getUsuario().getNome() + " agora está " + event.getUsuario().getStatus());
		
	}
	
	@EventListener
	public void enviodeSMSParaClienteAtivadoListener(UsuarioAtivadoEvent event) {
		System.out.println("Enviando SMS para o Usuário " + event.getUsuario().getNome());
		
	}


}
