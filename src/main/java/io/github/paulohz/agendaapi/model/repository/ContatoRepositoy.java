package io.github.paulohz.agendaapi.model.repository;

import io.github.paulohz.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepositoy extends JpaRepository<Contato, Integer> {
}
