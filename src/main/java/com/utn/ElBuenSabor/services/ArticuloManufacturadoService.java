package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.ArticuloManufacturado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado,Long>{

    List<ArticuloManufacturado> search(String filtro) throws Exception;

    Page<ArticuloManufacturado> search(String filtro, Pageable pageable) throws Exception;
}
