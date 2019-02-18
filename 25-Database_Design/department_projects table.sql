BEGIN TRANSACTION;
CREATE TABLE departments_projects
(
        department_id int not null,
        project_id int not null,
        
        constraint fk_departments_projects_department_id foreign key (department_id) references departments (department_id),
        constraint fk_departments_projects_project_id foreign key (project_id) references projects (project_id)
);

COMMIT;