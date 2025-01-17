package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.ArticuloManufacturado;
import com.utn.ElBuenSabor.repositories.ArticuloManufacturadoRepository;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImpl<ArticuloManufacturado, Long> implements ArticuloManufacturadoService{

    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    public ArticuloManufacturadoServiceImpl(BaseRepository<ArticuloManufacturado, Long> baseRepository) {
        super(baseRepository);
    }
    @Override
    public List<ArticuloManufacturado> search(String filtro) throws Exception {
        try{
            List<ArticuloManufacturado> articulosManufacturados = articuloManufacturadoRepository.findByDenominacionContaining(filtro);
            return articulosManufacturados;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<ArticuloManufacturado> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<ArticuloManufacturado> articulosManufacturados = articuloManufacturadoRepository.findByDenominacionContaining(filtro, pageable);
            return articulosManufacturados;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


}
