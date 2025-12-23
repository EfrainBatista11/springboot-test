package org.efrain_batista.springboot_test.repositories;

import org.efrain_batista.springboot_test.models.Banco;

import java.util.List;

public interface BancoRepository {

    List<Banco> findAll();

    Banco findById(Long id);

    void update(Banco banco);
}
