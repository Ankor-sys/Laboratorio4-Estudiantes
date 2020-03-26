create database bd_estudiantes;
use bd_estudiantes;

create table estudiantes(
ID_Estudiante int primary key,
NombreEstudiante varchar(90) not null,
CorreoEstudiante varchar(120) not null,
Edad int not null,
NumeroCelular varchar(12) not null

)engine InnoDB default charset = latin1