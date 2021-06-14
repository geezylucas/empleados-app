package com.geezylucas.app.services;

import com.geezylucas.app.entities.Empleado;

import java.util.List;

public interface IEmpleadoService {
    List<Empleado> buscarEmpleados();

    Empleado buscarPorIdEmpleado(String id);

    Empleado guardarEmpleado(Empleado newEmpleado);

    void eliminarEmpleado(String id);

}
