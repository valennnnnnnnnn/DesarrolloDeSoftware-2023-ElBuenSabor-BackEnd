package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.DetallePedidoArticuloManufacturado;
import com.utn.ElBuenSabor.services.DetallePedidoArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detallePedidoArticulosManufacturados")
public class DetallePedidoArticuloManufacturadoController extends BaseControllerImpl <DetallePedidoArticuloManufacturado, DetallePedidoArticuloManufacturadoServiceImpl>{
}
