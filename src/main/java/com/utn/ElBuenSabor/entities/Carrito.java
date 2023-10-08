package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "carrito")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Carrito extends Base{

    @NotNull
    @Column(name = "fecha_hora_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraCreacionCarrito;

    @NotNull
    @Column(name="numeroCarrito")
    private Integer numeroCarrito;
}
