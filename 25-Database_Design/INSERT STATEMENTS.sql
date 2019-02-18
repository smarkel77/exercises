INSERT INTO departments (department_name)
VALUES ('Marketing'), ('Sales'), ('Production'), ('Maintenance')
;

INSERT INTO employees (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES ('Chicken Referee', 'Glick', 'Francis', 'MALE', '04/20/1974', '12/01/2003', 3), ('VP of Vacuums', 'Charles', 'Sneezy', 'MALE', '07/03/1963', '02/01/2013', 4), 
('Lego Color Organizer', 'Smith', 'Dillon', 'MALE', '10/08/1987', '06/01/2012', 1), ('Lettuce Cleaner', 'Darwin', 'Xavier', 'MALE', '11/09/1981', '12/01/2003', 4),
('Laserdisc Salesperson', 'Gross', 'Nadine', null, '07/21/1974', '10/10/2010', 2), ('Used Teeth Salesperson', 'Smith', 'Dinah', 'FEMALE', '12/20/1976', '02/21/2016', 2),
('Media Scrubber', 'Charles', 'Charlie', 'MALE', '01/01/1971', '09/29/2015', 1), ('Cheese Scrubber', 'Beach', 'Fran', 'FEMALE', '01/01/1971', '09/29/2015', 3)
;

INSERT INTO projects (project_name, start_date)
VALUES ('Chicken Launcher', '11/14/2013'), ('SBD-Noisemaker', '07/12/2016'), ('Cheese Hole Filler', '05/17/1998'), ('Teeth Accentuator', '02/20/1971')
;

INSERT INTO employees_projects (employee_id, project_id)
VALUES (1, 1), (2, 2), (3, 3), (4, 4), (5, 1), (6, 2), (7, 3), (8, 4), (1, 4), (2, 3), (3, 2), (4, 1)
;

INSERT INTO departments_projects (department_id, project_id)
VALUES (1, 4), (2, 4), (3, 4), (4, 4), (4, 1), (3, 2), (2, 3), (1, 4)
;