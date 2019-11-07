package com.flowkode.panache;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestEntity {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
