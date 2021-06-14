package com.geezylucas.app.daos;

import com.geezylucas.app.entities.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoDao extends MongoRepository<Empleado, String> {
}
