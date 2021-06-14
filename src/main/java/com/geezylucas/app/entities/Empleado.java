package com.geezylucas.app.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "empleado")
public class Empleado {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String direccion;
    private String telefono;
}
