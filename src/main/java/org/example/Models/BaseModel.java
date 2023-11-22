package org.example.Models;

import java.util.Date;

public class BaseModel {
    private Long id;
    private Date createdAt;

    private Date updateddAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
