package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.ArticuloManufacturado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado,Long>{
    List<ArticuloManufacturado> findByNombreContaining(String nombre);

    Page<ArticuloManufacturado> findByNombreContaining(String nombre, Pageable pageable);

    //Anotacion JPQL
    @Query(value = "SELECT p FROM ArticuloManufacturado a WHERE a.nombre LIKE %:filtro%")
    List<ArticuloManufacturado> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM ArticuloManufacturado a WHERE a.nombre LIKE %:filtro%")
    Page<ArticuloManufacturado> search(@Param("filtro") String filtro, Pageable pageable);
}
