package br.com.lucasladeira.hrworker.repositories;

import br.com.lucasladeira.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
