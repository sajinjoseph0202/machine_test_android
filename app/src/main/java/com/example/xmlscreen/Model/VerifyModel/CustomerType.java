package com.example.xmlscreen.Model.VerifyModel;

public class CustomerType {
    private long id;
    private String name;
    private String createdAt;
    private Object deletedAt;
    private String updatedAt;
    private String systemIdentifier;
    private Object pages;
    private Object pagePermissions;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    public Object getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Object value) { this.deletedAt = value; }

    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String value) { this.updatedAt = value; }

    public String getSystemIdentifier() { return systemIdentifier; }
    public void setSystemIdentifier(String value) { this.systemIdentifier = value; }

    public Object getPages() { return pages; }
    public void setPages(Object value) { this.pages = value; }

    public Object getPagePermissions() { return pagePermissions; }
    public void setPagePermissions(Object value) { this.pagePermissions = value; }
}
