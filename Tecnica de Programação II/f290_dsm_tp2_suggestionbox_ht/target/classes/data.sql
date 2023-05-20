create table categories(
    id int primary key auto_increment,
    tarefas varchar(100) not null,
    dia varchar(50) not null
);

insert into categories(tarefas, dia) values
('Entregar atividade de Logica de Programacao', '19 de maio'),
('Buscar oculos na otica', '23 de maio'),
('Consulta medica', '29 de maio');