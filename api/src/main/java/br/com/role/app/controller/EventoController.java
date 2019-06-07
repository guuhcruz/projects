package br.com.role.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.role.app.dto.EventoDTO;

@RestController
@RequestMapping("/eventos")
public class EventoController {

	@GetMapping(params = { "idEvento" })
	public ResponseEntity<List<EventoDTO>> getEventoPorId(@RequestParam Integer idEvento) {
		return null;
	}
}
