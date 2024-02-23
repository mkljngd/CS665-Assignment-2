/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 22/08/2024 
 * File Name: Main.java 
 * Description: The Main class serves as the entry point of the application, where the observer 
 * design pattern is demonstrated. It initializes the system, then subscribes drivers to the 
 * notification service, simulates the creation of a delivery request, and shows subscribed 
 * drivers are notified about the new delivery request.
 */

package edu.bu.met.cs665;

/**
 * Demonstrates the functionality of the delivery notification system. This class initializes the
 * system, creates several drivers, subscribes them to a notification service, and then notifies
 * them about a new delivery request.
 */
public class Main {
  /**
   * The entry point of the application.
   *
   * @param args The command-line arguments (not used).
   */
  public static void main(String[] args) {

    // Adding drivers
    Driver[] drivers = new Driver[5];

    NotificationService notificationService = new NotificationService();
    // Instantiate each driver and add them to the array
    for (int i = 0; i < drivers.length; i++) {
      drivers[i] = new Driver("D" + (i + 1), "Driver" + (i + 1));
      notificationService.subscribe(drivers[i]);
    }

    drivers[1].setAvailable(false); // Set driver2 as unavailable
    drivers[2].setAvailable(false); // Set driver3 as unavailable

    Shop shop = new Shop("Best Shop", "123 Main St");
    // Create a delivery request
    DeliveryRequest request = shop.createDeliveryRequest("YOLO", "25 Chester St", "Ferrari");

    notificationService.notifyDrivers(request);
  }
}
