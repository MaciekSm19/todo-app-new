CREATE TABLE IF NOT EXISTS tasks_groups (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(100) not null,
    done bit
);

alter table TASKS add column task_group_id int null;
alter table TASKS add foreign key (task_group_id) references tasks_groups(id);
