package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Carrito;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceImpl extends BaseServiceImpl<Carrito, Long> implements CarritoService{
    @Autowired
    private CarritoRepository carritoRepository;

    public CarritoServiceImpl(BaseRepository<Carrito, Long> baseRepository, CarritoRepository carritoRepository) {
        super(baseRepository);
        this.carritoRepository = carritoRepository;
    }
}
