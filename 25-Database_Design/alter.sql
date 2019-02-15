BEGIN TRANSACTION;

ALTER TABLE employees ADD constraint fk_employee_department_id foreign key (department_id) references departments (department_id);

ROLLBACK;