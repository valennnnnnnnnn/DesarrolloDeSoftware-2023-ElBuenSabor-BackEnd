package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.Factura;
import com.utn.ElBuenSabor.services.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/facturas")
public class FacturaController  extends BaseControllerImpl<Factura, FacturaServiceImpl>{
}
