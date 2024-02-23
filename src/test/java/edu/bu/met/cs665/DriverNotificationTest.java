/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 22/08/2024 
 * File Name: BeverageTests.java 
 * Description: Test cases for the assignment.
 */

package edu.bu.met.cs665;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DriverNotificationTest {
  private NotificationService notificationService;
  private Shop shop;
  private DeliveryRequest request;
  private Driver[] drivers;

  @Before
  public void setUp() {
    notificationService = new NotificationService();
    shop = new Shop("New Shop", "775 Commonwealth Avenue");
    drivers = new Driver[5];
    for (int i = 0; i < drivers.length; i++) {
      drivers[i] = new Driver("D" + (i + 1), "Driver" + (i + 1));
      notificationService.subscribe(drivers[i]);
    }
    request = shop.createDeliveryRequest("ORDER_2202", "25 Chester St", "Ferrari");
  }
  @Test
  public void testShopCreation() {
    assertEquals(shop.getName(), "New Shop");
    assertEquals(shop.getAddress(), "775 Commonwealth Avenue");
  }

  @Test
  public void testDriverCreation() {
    List<Driver> requestDrivers = notificationService.getDrivers();
    List<Driver> driversList = Arrays.asList(drivers);
    assertTrue("The drivers array and requestDrivers list should contain the same elements",
            driversList.containsAll(requestDrivers) && requestDrivers.containsAll(driversList));
  }

  @Test
  public void testDriverUpdates() {
    List<Driver> driversList = new ArrayList<>(Arrays.asList(drivers));
    for (int i = 0; i < drivers.length; i = i + 2) {
      Driver tempDriver = drivers[i];
      notificationService.unsubscribe(tempDriver);
      driversList.remove(tempDriver);
    }
    List<Driver> requestDrivers = notificationService.getDrivers();
    assertTrue("The drivers array and requestDrivers list should contain the same elements",
            driversList.containsAll(requestDrivers) && requestDrivers.containsAll(driversList));
  }

  @Test
  public void testDeliveryRequestCreation() {
    assertEquals(request.getShopName(), "New Shop");
    assertEquals(request.getDeliveryAddress(), "25 Chester St");
    assertEquals(request.getProductDetails(), "Ferrari");
  }

  @Test
  public void testDeliveryRequestNotification() {
    notificationService.notifyDrivers(request);
    assertTrue(true);
  }
}
