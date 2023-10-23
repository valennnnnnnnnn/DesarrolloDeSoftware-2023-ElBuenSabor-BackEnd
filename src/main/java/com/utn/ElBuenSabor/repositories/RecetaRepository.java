package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Receta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaRepository extends BaseRepository<Receta,Long>{


    List<Receta> findByNombreRecetaContaining(String nombreReceta);

    Page<Receta> findByNombreRecetaContaining(String nombreReceta, Pageable pageable);
    //Anotacion JPQL parametros nombrados
    @Query(value = "SELECT r FROM Receta r WHERE r.nombreReceta LIKE %:filtro%")
    List<Receta> search(@Param("filtro") String filtro);

    @Query(value = "SELECT r FROM Receta r WHERE r.nombreReceta LIKE %:filtro%")
    Page<Receta> search(@Param("filtro") String filtro, Pageable pageable);
}
