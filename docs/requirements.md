# Table Of Content

1. **Authentication (roles based)**
2. **Product Management**
   - Import/Export products in bulk using spreadsheet (CSV/Excel)
   - CRUD operations

3. **Stock Management**
   - Add/Remove stock manually for each product
   - Add/Remove stock in bulk using spreadsheet (CSV/Excel)
   - Save the vendor information as well

4. **Alerts for low stock**

5. **Receipt**
   - Physical receipt
   - PDF or another format document, share via Email or WhatsApp

6. **Sales & Invoice**
   - create invoice
   - payment methods (card, cash)
   - discounts and tax

7. **Customers**
   - purchase history
   - loyalty points

8. **Analytics (filter: day, week, month, all time)**
   - Total sales
   - Total refunds
   - Graph Analytics (bar/pie)

9. **Cloud Sync / Offline Mode**
   - Redis to save cache
   - should be available for offline use and sync when online

10. **Logs**
    - Track logins, sales, edits, voids, etc.
    - Useful for auditing

11. **Internationalization**
    - Language support
    - Currency formatting

12. **Security**
    - Password encryption (BCrypt)

____

## 1. Authentication

- Role base access (Admin, Cashier, Manager)
- `ADMIN` can perform CRUD operations on products, user accounts and add more Cashiers and Managers
- In case of password reset, `Admin` will manage the passwords
- In case `Admin` forgets the password, contact the developer for support

### `Role: ADMIN`
- Analytics
- 