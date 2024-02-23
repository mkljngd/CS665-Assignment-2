/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 22/08/2024 
 * File Name: NotificationService.java 
 * Description: The NotificationService class acts as the subject in the Observer Design Pattern.
 * It maintains a list of observers (Driver) that are subscribed to receive notifications. 
 * The class provides methods to add (subscribe) or remove (unsubscribe) observers from the 
 * notification list. When a new DeliveryRequest is made, the NotificationService notifies all
 * subscribed drivers by calling their notify method.
 */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
  private List<Driver> drivers;

  public NotificationService() {
    this.drivers = new ArrayList<>();
  }

  public void subscribe(Driver driver) {
    drivers.add(driver);
  }

  public void unsubscribe(Driver driver) {
    drivers.remove(driver);
  }

  public List<Driver> getDrivers() {
    return drivers;
  }

  /**
   * Notifies all subscribed drivers about a new delivery request.
   *
   * @param request The delivery request to notify about.
   */
  public void notifyDrivers(DeliveryRequest request) {
    for (Driver driver : drivers) {
      driver.notify(request);
    }
  }
}
