# Workshop2
Java DAO workshop - object-oriented data access layer using JDBC and MySQL
Projekt warsztatowy przedstawiający implementację obiektowej warstwy dostępu do danych (DAO – Data Access Object) w języku Java z wykorzystaniem JDBC oraz bazy danych MySQL.

## Cel projektu

Celem projektu jest stworzenie klasy `UserDao`, umożliwiającej wykonywanie operacji CRUD na tabeli `users` w bazie danych `workshop2`.

Projekt łączy:
- programowanie obiektowe (OOP)
- pracę z bazą danych MySQL
- wykorzystanie JDBC
- praktyczne zastosowanie wzorca DAO

## Struktura bazy danych

Baza danych: `workshop2`  
Tabela: `users`

```sql
CREATE TABLE users (
    id INT(11) NOT NULL AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL UNIQUE,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(60) NOT NULL,
    PRIMARY KEY (id)
);
