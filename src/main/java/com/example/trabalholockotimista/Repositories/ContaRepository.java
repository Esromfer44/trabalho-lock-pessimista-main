package com.example.trabalholockotimista.Repositories;

import com.example.trabalholockotimista.Entities.NewConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<NewConta, Long> {
    NewConta findByNumeroConta(String numeroConta);
}
