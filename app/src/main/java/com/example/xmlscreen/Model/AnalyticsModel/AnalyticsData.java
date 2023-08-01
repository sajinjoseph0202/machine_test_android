package com.example.xmlscreen.Model.AnalyticsModel;

public class AnalyticsData {
    private int approved;
    private int disputed;
    private int pending;
    private int closed;
    private int cancelled;
    private int total;

    public int getApproved() { return approved; }
    public void setApproved(int value) { this.approved = value; }

    public int getDisputed() { return disputed; }
    public void setDisputed(int value) { this.disputed = value; }

    public int getPending() { return pending; }
    public void setPending(int value) { this.pending = value; }

    public int getClosed() { return closed; }
    public void setClosed(int value) { this.closed = value; }

    public int getCancelled() { return cancelled; }
    public void setCancelled(int value) { this.cancelled = value; }

    public int getTotal() { return total; }
    public void setTotal(int value) { this.total = value; }
}
