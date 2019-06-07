package br.com.role.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.role.app.entities.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {

	Evento findByDescEvento(String descricao);
}
