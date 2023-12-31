# E-Commerce Console App

This is a console-based e-commerce application showcasing OOP concepts acquired in class such as inheritance, polymorphism, encapsulation, abstraction, and design patterns.
It should enable users to perform typical e-commerce tasks.

## Features

- *User authentication*: Sign up and Log in functionality.
- *Admin dashboard*: Provide all Admin functions from Inventory manipulation to user bans.
- *User dashboard*: All the features a customer would need to interact with the app.
- *Product browsing*: Users can view a list of available products and dynamically search for specific products filtering by price and/or category.
- *Shopping cart*: Users can add products to their shopping cart, view the contents of their cart, remove items from the cart or update them.
- *Checkout*: Users can proceed to checkout and complete their purchase with their preferred payment method, the order is then processed and logged.
- *Inventory management*: Admins can add new products to the inventory, update existing products or remove them, Inventory is updated upon each purchase and users are notified if a product is out of stock.
- *Payment methods*: Offer MasterCard, E-Dinar and User Credits options, the latter being processed in app.
- *Order history*: Users can view past orders and track the status of their current orders. Admins can access all orders.
- *Shipping options*: Users can choose between standard and express shipping, the shipping cost is calculated and added to the total cost of the order., users can also choose to pick up their order from the store and avoid shipping costs.
- *Product reviews*: Users can leave reviews on products they have purchased, an average rating is calculated and displayed on the product page.

## Design Decisions

- The app is designed to be as modular as possible, each class is responsible for a specific set of tasks adhering to the Single Responsibility Principle.
- The app is designed to be as extensible as possible, new features can be added with minimal changes to the existing codebase, nested menus enable the addition of new features without having to change the main menu.
- The Admin class applies the Singleton design pattern to ensure that only one instance of the class is created, this is done deliberately to reduce unnecessary complexity as multiple instances serve indistinguishable functionality and are thus redundant.
- The Singleton design pattern is also applied to the Inventory and Orders classes as only one instance of each is needed.
- The Login class applies the Factory design pattern to create instances of the User class based on the user's role, it also insures that only one user can be logged in at a time so they can manage shared resources safely.
- The Payment class applies the Strategy design pattern to allow for different payment methods to be used interchangeably, it also allows for new payment methods to be added easily.

## Installation

1. Clone the repository: `git clone https://github.com/Ala-ADN/TP-java-oop`
2. Navigate to the project directory
3. Run Main.java in src folder
4. No additional dependencies needed