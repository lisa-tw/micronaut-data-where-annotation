package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.*;

import javax.annotation.Nullable;
import java.util.Set;

@MappedEntity
@Introspected
public class Entity {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    public Entity(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
