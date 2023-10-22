package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Receta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RecetaService extends BaseService<Receta,Long>{
    List<Receta> search(String filtro) throws Exception;

    Page<Receta> search(String filtro, Pageable pageable) throws Exception;
}
