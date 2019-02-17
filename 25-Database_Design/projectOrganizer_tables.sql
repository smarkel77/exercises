BEGIN TRANSACTION;

CREATE TABLE departments
(
        department_id serial not null,
        department_name varchar(100) unique,
        
        constraint pk_department_id primary key (department_id)
);


CREATE TABLE employees
(
        employee_id serial not null,
        job_title varchar(100) not null,
        last_name varchar(100) not null,
        first_name varchar(100) not null,
        gender varchar(100) null,
        date_of_birth date not null,
        date_of_hire date not null,
        department_id int not null,
        
        constraint pk_employee_id primary key (employee_id),
        constraint fk_employee_department_department_id foreign key (department_id) references departments (department_id)
);

CREATE TABLE projects
(
        project_id serial not null,
        project_name varchar(100) not null, 
        start_date date not null,
        
        constraint pk_project_id primary key (project_id)
);

CREATE TABLE employees_projects
(
        employee_id int not null,
        project_id int not null,
        
        constraint fk_employees_projects_employee_id foreign key (employee_id) references employees (employee_id),
        constraint fk_employees_projects_project_id foreign key (project_id) references projects (project_id)
);


COMMIT;