package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente,Long> {
}
