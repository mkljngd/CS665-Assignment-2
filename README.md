# Delivery System README

## Overview

The Delivery System is a Java-based application designed for a collaborative environment involving a collection of retailers and local drivers to efficiently manage the delivery of products to customer destinations. 
This system allows shops to create delivery requests which are then broadcasted to all subscribed drivers, ensuring that delivery operations are streamlined and efficient.

## Components

The system is composed of several key components:

- **Shop**: Represents a retail entity that can create delivery requests for product delivery to customers.
- **DeliveryRequest**: Encapsulates all the necessary details about a delivery request, including the order ID, shop name, delivery address, and product details.
- **Driver**: Represents a delivery driver who can receive notifications about new delivery requests. Drivers have the ability to be marked as available or unavailable.
- **NotificationService**: Manages the subscription of drivers to delivery requests and notifies them when a new request is made.
- **Main**: The entry point of the application, which sets up the system, subscribes drivers, and initiates a sample delivery request for demonstration purposes.
- **DriverNotificationTest**: Contains JUnit tests to verify the functionality of the notification system, ensuring that drivers are correctly notified of new delivery requests.

## Setup and Execution

1. **Compilation**: Ensure you have a Java Development Kit (JDK) installed. Compile the application using your preferred Java compiler or through a build automation tool like Maven.

2. **Running the Application**: Execute the `Main` class to start the application. This will simulate the process of creating a delivery request by a shop and notifying all subscribed drivers.

3. **Testing**: Execute the JUnit tests in `DriverNotificationTest` to verify the correctness of the notification logic. Ensure you have JUnit integrated into your project setup.

## Design Considerations

- The application follows object-oriented design principles, ensuring modularity, reusability, and scalability.
- Flexibility is ensured through the use of arrays and dynamic data structures like `ArrayList`, allowing for easy management of drivers.
- The Observer pattern is simulated through the `NotificationService`, allowing for efficient notification of drivers without tight coupling between components.


## License

---

