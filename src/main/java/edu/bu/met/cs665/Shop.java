/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 22/08/2024 
 * File Name: Driver.java 
 * Description: The Shop class represents a store that can create delivery requests. When a 
 * shop creates a delivery request, the NotificationService (subject) notifies all subscribed
 * drivers (observers).
 */

package edu.bu.met.cs665;

public class Shop {
  private String name;
  private String address;

  public Shop(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public DeliveryRequest createDeliveryRequest(
      String orderId, String deliveryAddress, String productDetails) {
    return new DeliveryRequest(orderId, this.name, deliveryAddress, productDetails);
  }
}
