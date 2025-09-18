# 🚗 EasyCar Rent – Refined Data Model

## 🧭 Conventions
- Tables and columns use **snake_case**, in **singular**.  
- Primary keys are **UUID** generated with `gen_random_uuid()` (`CREATE EXTENSION pgcrypto;`).  
- 🕵️ **Audit fields (7):**  
  - `status`  
  - `created_at` / `created_by`  
  - `updated_at` / `updated_by`  
  - `deleted_at` / `deleted_by`  
- Foreign Keys use **ON UPDATE CASCADE** and **ON DELETE** rules appropriate to the domain.  
- 🆔 **Unique constraints** on codes and names (scoped where applicable).  

---

## 👤 Module: Customer Management
**customer** {id, first_name, last_name, document_number, phone, email, address}  
**driving_license** {id, license_number, category, expiry_date, customer_id}  
**customer_history** {id, notes, customer_id}  

---

## 🚘 Module: Fleet Management
**vehicle** {id, brand, model, plate, vehicle_category_id, vehicle_status_id}  
**vehicle_category** {id, code, name, description}  
**vehicle_status** {id, code, name, description}  

---

## 📅 Module: Reservation Management
**reservation** {id, start_date, end_date, customer_id, vehicle_id, reservation_status_id, branch_id, reservation_type_id}  
**reservation_status** {id, code, name, description}  
**branch** {id, code, name, location}  
**reservation_type** {id, code, name, description}  

---

### 🔗 Relationships
- `driving_license.customer_id` → **customer.id**  
- `customer_history.customer_id` → **customer.id**  
- `vehicle.vehicle_category_id` → **vehicle_category.id**  
- `vehicle.vehicle_status_id` → **vehicle_status.id**  
- `reservation.customer_id` → **customer.id**  
- `reservation.vehicle_id` → **vehicle.id**  
- `reservation.reservation_status_id` → **reservation_status.id**  
- `reservation.branch_id` → **branch.id**  
- `reservation.reservation_type_id` → **reservation_type.id**  

---

### ⚙️ Referential Actions
- **ON UPDATE CASCADE** in all foreign keys.  
- **ON DELETE RESTRICT** for critical entities (customer, vehicle, branch).  
- **ON DELETE SET NULL** for optional relationships when applicable.  

