package com.example.xmlscreen.Model.TrendingModel;

public class PackageMaterial {
    private long id;
    private String name;
    private boolean isActive;
    private String createdAt;
    private String updatedAt;
    private Object deletedAt;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public boolean getIsActive() { return isActive; }
    public void setIsActive(boolean value) { this.isActive = value; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String value) { this.updatedAt = value; }

    public Object getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Object value) { this.deletedAt = value; }
}