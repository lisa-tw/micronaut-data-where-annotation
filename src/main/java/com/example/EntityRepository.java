package com.example;

import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.data.annotation.Where;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@JdbcRepository(dialect = Dialect.H2)
public interface EntityRepository extends CrudRepository<Entity, Long> {

    @Where(value = "description = ${description}")
    @NonNull
    List<Entity> findAll(String description);
}
