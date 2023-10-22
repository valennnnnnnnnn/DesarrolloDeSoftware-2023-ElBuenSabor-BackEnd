package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.DetallePedidoCombo;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.DetallePedidoComboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoComboServiceImpl extends BaseServiceImpl<DetallePedidoCombo, Long> implements DetallePedidoComboService{

    @Autowired
    private DetallePedidoComboRepository detallePedidoComboRepository;

    public DetallePedidoComboServiceImpl(BaseRepository<DetallePedidoCombo, Long> baseRepository, DetallePedidoComboRepository detallePedidoComboRepository) {
        super(baseRepository);
        this.detallePedidoComboRepository = detallePedidoComboRepository;
    }
}
