CREATE DATABASE universidad_db;
USE universidad_db;

CREATE TABLE materia (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    creditos INT
);

CREATE TABLE docente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    especialidad VARCHAR(100)
);

CREATE TABLE estudiante (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    correo VARCHAR(100)
);

CREATE TABLE grupo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    materia_id INT,
    docente_id INT,
    FOREIGN KEY (materia_id) REFERENCES materia(id),
    FOREIGN KEY (docente_id) REFERENCES docente(id)
);

CREATE TABLE inscripcion_curso (
    id INT PRIMARY KEY AUTO_INCREMENT,
    estudiante_id INT,
    grupo_id INT,
    fecha_inscripcion DATE,
    FOREIGN KEY (estudiante_id) REFERENCES estudiante(id),
    FOREIGN KEY (grupo_id) REFERENCES grupo(id)
);