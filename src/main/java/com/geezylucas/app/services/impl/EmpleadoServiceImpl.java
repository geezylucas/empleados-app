package com.geezylucas.app.services.impl;

import com.geezylucas.app.daos.IEmpleadoDao;
import com.geezylucas.app.entities.Empleado;
import com.geezylucas.app.services.IEmpleadoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmpleadoServiceImpl implements IEmpleadoService {

    private final IEmpleadoDao empleadoDao;

    @Override
    public List<Empleado> buscarEmpleados() {
        log.info("#### MÉTODO buscarEmpleados ####");

        return empleadoDao.findAll();
    }

    @Override
    public Empleado buscarPorIdEmpleado(String id) {
        log.info("#### MÉTODO buscarPorIdEmpleado {} ####", id);

        return empleadoDao.findById(id).orElse(null);
    }

    @Override
    public Empleado guardarEmpleado(Empleado newEmpleado) {
        log.info("#### MÉTODO guardarEmpleado ####");

        return empleadoDao.save(newEmpleado);
    }

    @Override
    public void eliminarEmpleado(String id) {
        log.info("#### MÉTODO eliminarEmpleado {} ####", id);

        empleadoDao.deleteById(id);
    }
}
