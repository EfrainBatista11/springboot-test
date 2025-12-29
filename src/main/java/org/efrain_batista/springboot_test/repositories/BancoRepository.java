package org.efrain_batista.springboot_test.repositories;

import org.efrain_batista.springboot_test.models.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

// import java.util.List;

public interface BancoRepository extends JpaRepository<Banco, Long> {

    // List<Banco> findAll();

    // Banco findById(Long id);

    // void update(Banco banco);
}
