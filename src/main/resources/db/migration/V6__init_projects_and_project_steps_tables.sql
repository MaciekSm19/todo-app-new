CREATE TABLE IF NOT EXISTS projects (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(100) not null
);

alter table TASKS_GROUPS add column project_id int null;
alter table TASKS_GROUPS add foreign key (project_id) references tasks_groups(id);

CREATE TABLE IF NOT EXISTS project_steps (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(100) not null,
    project_id INTEGER references projects(id),
    days_to_deadline INTEGER
);