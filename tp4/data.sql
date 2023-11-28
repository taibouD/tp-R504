CREATE DATABASE demosql;
USE demosql;
CREATE TABLE myTable (id INT AUTO_INCREMENT,name VARCHAR (45) NOT NULL,PRIMARY KEY (id));
INSERT INTO myTable (name) VALUES ('bob');
INSERT INTO myTable (name) VALUES ('alice');
