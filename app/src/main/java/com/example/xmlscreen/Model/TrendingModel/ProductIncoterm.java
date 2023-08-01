package com.example.xmlscreen.Model.TrendingModel;

public class ProductIncoterm {
    private long id;
    private String price;
    private MetaData metaData;
    private IncoTerm incoTerm;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getPrice() { return price; }
    public void setPrice(String value) { this.price = value; }

    public MetaData getMetaData() { return metaData; }
    public void setMetaData(MetaData value) { this.metaData = value; }

    public IncoTerm getIncoTerm() { return incoTerm; }
    public void setIncoTerm(IncoTerm value) { this.incoTerm = value; }
}