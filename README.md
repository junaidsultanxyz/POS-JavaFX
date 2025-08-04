# POS System

A role-based Point of Sale (POS) system built using **JavaFX** and **MySQL**.  
This system is designed for small and medium-sized businesses with support for multi-user access, analytics, offline sync, and auditing.

---

## Features

### 1. Authentication (Roles Based)
- Role-based access control: **Admin**, **Manager**, and **Cashier**
- Secure login system with **BCrypt password encryption**
- Admin-managed password resets

### 2. Product Management
- Import/export products in bulk via CSV/Excel
- CRUD operations for products
- SKU-based product tracking
- Link products with vendors

### 3. Stock Management
- Manual and bulk stock adjustments
- Vendor tracking during stock updates
- Inventory logs for stock change auditing

### 4. Alerts for Low Stock
- Configurable minimum stock threshold
- Real-time alerts for low stock

### 5. Receipt
- Print physical receipts
- Generate PDF receipts and share via Email or WhatsApp

### 6. Sales & Invoice
- Create invoices
- Multiple payment methods: Cash, Card, Mobile Payments
- Discounts and tax support
- Refund and void transactions

### 7. Customers
- Customer profiles and purchase history
- ~~Loyalty points tracking (1–5 scale)~~

### 8. Analytics
- Filter analytics by day, week, month, or all-time
- View total sales and refunds
- Graphical analytics (bar/pie charts)

### 9. Cloud Sync / Offline Mode
- Automatic sync with the central database when online

### 10. Logs
- Track user actions (logins, sales, edits, voids)
- Inventory logs for auditing

### 11. Internationalization
- Multi-language support
- Currency formatting based on locale

### 12. Security
- BCrypt password encryption
- Secure role-based authorization
- Encrypted database connections

---

## Technology Stack

| Component         | Technology         |
|-------------------|--------------------|
| UI Framework      | JavaFX            |
| Backend           | Java              |
| Database          | MySQL             |
| Dependency Mgmt   | Maven             |

---

## Database Schema
The database schema includes the following tables:
- `roles`
- `users`
- `products`
- `vendors`
- `orders`
- `order_items`
- `inventory_logs`
- `logs`

> See [POS_System_Requirements.md](./POS_System_Requirements.md) for detailed schema and requirements.

---

## Installation

### Prerequisites
- Java 21 or later
- MySQL Server
- Maven
- Git

### Steps
```bash
# Clone the repository
git clone https://github.com/junaidsultanxyz/POS-JavaFX.git

# Navigate into the project directory
cd POS-JavaFX

# Configure database (update config file)
nano src/main/resources/config.properties

# Build the project
./mvnw clean install

# Run the project
./mvnw javafx:run
```

---

## Future Enhancements
- AI-driven analytics (sales predictions, automated insights)
- Mobile companion app for managers
- Vendor portal for stock updates

---

## License
This project is licensed under the [MIT License](LICENSE).

---

## Author
Developed by **Junaid Sultan**  
