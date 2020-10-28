package com.example;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

@MicronautTest
public class DemoTest {

    @Inject
    EntityRepository repository;

    @Test
    void testBuildWhereClause() {
        Entity entity = new Entity("entity 1");
        repository.save(entity);
        Assertions.assertEquals(1, repository.findAll("entity 1").size());
    }
}
