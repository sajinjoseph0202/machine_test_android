package com.example.xmlscreen.Model.VerifyModel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class VerifyUser {
    private long id;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    private String email;
    private String phone;
    private String country;
    private boolean isActive;
    private Object emailVerifiedAt;
    private String phoneVerifiedAt;
    private Object otpExpiresAt;
    private boolean isOnboarded;
    private String createdAt;
    private String updatedAt;
    private Object deletedAt;
    private String refreshToken;
    private long isTempUser;
    private ArrayList<CustomerType> roles;
    private CustomerType customerType;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { this.firstName = value; }

    public String getLastName() { return lastName; }
    public void setLastName(String value) { this.lastName = value; }

    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    public String getPhone() { return phone; }
    public void setPhone(String value) { this.phone = value; }

    public String getCountry() { return country; }
    public void setCountry(String value) { this.country = value; }

    public boolean getIsActive() { return isActive; }
    public void setIsActive(boolean value) { this.isActive = value; }

    public Object getEmailVerifiedAt() { return emailVerifiedAt; }
    public void setEmailVerifiedAt(Object value) { this.emailVerifiedAt = value; }

    public String getPhoneVerifiedAt() { return phoneVerifiedAt; }
    public void setPhoneVerifiedAt(String value) { this.phoneVerifiedAt = value; }

    public Object getOtpExpiresAt() { return otpExpiresAt; }
    public void setOtpExpiresAt(Object value) { this.otpExpiresAt = value; }

    public boolean getIsOnboarded() { return isOnboarded; }
    public void setIsOnboarded(boolean value) { this.isOnboarded = value; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    public String getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(String value) { this.updatedAt = value; }

    public Object getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Object value) { this.deletedAt = value; }

    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String value) { this.refreshToken = value; }

    public long getIsTempUser() { return isTempUser; }
    public void setIsTempUser(long value) { this.isTempUser = value; }

    public ArrayList<CustomerType> getRoles() { return roles; }
    public void setRoles(ArrayList<CustomerType> value) { this.roles = value; }

    public CustomerType getCustomerType() { return customerType; }
    public void setCustomerType(CustomerType value) { this.customerType = value; }
}
