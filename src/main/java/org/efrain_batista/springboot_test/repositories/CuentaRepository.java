package org.efrain_batista.springboot_test.repositories;

import org.efrain_batista.springboot_test.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

// import java.util.List;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

    @Query("select c from Cuenta c where c.persona=?1")
    Optional<Cuenta> findByPersona(String persona);

    // Como extendemos de JpaRepository no requiere que uno defina estos métodos
    // List<Cuenta> findAll();

    // Cuenta findById(Long id);

    // Se usa save para guardar y actualizar, para este ejemplo ser explícitos update
    // void update(Cuenta cuenta);
}
