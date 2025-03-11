package com.example.dispatch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private String orderId;
    private double latitude;
    private double longitude;
    private String address;
    private int packageWeight;
    private String priority; // HIGH, MEDIUM, LOW

    public Order() {}

    public Order(String orderId, double latitude, double longitude, String address, int packageWeight, String priority) {
        this.orderId = orderId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.packageWeight = packageWeight;
        this.priority = priority;
    }

    // Getters and Setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getPackageWeight() { return packageWeight; }
    public void setPackageWeight(int packageWeight) { this.packageWeight = packageWeight; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
}
