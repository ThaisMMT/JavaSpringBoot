package br.com.alura.tmmt.screenmatch.domain.filme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository <Filme, Long> {
}
