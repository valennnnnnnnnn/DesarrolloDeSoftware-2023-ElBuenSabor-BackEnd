package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.Carrito;
import com.utn.ElBuenSabor.services.CarritoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/carrito")
public class CarritoController extends BaseControllerImpl<Carrito, CarritoServiceImpl>{
}
