package com.example.xmlscreen.Model.TrendingModel;

public class IncoTerm {
    private long id;
    private String name;
    private String description;
    private String type;
    private boolean isActive;
    private String createdAt;
    private String updatedAt;
    private Object deletedAt;
    private String systemIdentifier;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public boolean getIsActive() { return isActive; }
    public void setIsActive(boolean value) { this.isActive = value; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String value) { this.updatedAt = value; }

    public Object getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Object value) { this.deletedAt = value; }

    public String getSystemIdentifier() { return systemIdentifier; }
    public void setSystemIdentifier(String value) { this.systemIdentifier = value; }
}
