package org.efrain_batista.springboot_test.repositories;

import org.efrain_batista.springboot_test.models.Cuenta;

import java.util.List;

public interface CuentaRepository {

    List<Cuenta> findAll();

    Cuenta findById(Long id);

    // Se usa save para guardar y actualizar, para este ejemplo ser explícitos update
    void update(Cuenta cuenta);
}
