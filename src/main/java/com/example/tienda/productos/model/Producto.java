package com.example.tienda.productos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@noArgsConstructor
@AllArgsConstructor
public class Producto {
    private Integer id;

    @NotBlank(message = "El nombre del producto no puede estar vacío")
    private String nombre;

    @NotNull(message = " el precio del producto no puede ser nulo")
    @Positive(message = "el precio del producto no puede ser 0 o negativo")
    private Double precio;

}

