package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Factura;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService{
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }
}
