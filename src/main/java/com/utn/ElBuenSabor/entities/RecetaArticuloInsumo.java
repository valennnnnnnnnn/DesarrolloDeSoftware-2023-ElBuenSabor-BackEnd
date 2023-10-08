package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecetaArticuloInsumo extends Base{

    @NotNull
    @Column(name = "cantidad")
    private int cantidad;

    @NotNull
    @Column(name = "receta_articulo_insumo")
    @ManyToOne()
    private Receta recetaArticuloInsumo;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_articuloInsumo")
    private ArticuloInsumo articuloInsumo;
}
