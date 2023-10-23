package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.DetalleFactura;
import com.utn.ElBuenSabor.entities.Factura;
import jakarta.persistence.OneToMany;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends BaseRepository<Factura,Long>{
}
