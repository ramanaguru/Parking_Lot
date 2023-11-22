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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateddAt() {
        return updateddAt;
    }

    public void setUpdateddAt(Date updateddAt) {
        this.updateddAt = updateddAt;
    }
}
