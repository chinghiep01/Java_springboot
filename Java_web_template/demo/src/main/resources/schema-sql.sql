CREATE TABLE IF NOT EXISTS User (

    id INT(10) NOT NULL AUTO_INCREMENT,

    fname VARCHAR(50) NOT NULL,

    lname VARCHAR(50) NOT NULL,

    p_a_salary DECIMAL(10,2) NOT NULL,

    payment_date VARCHAR(50) NOT NULL,

    super_rate DECIMAL(10,2) NOT NULL,

    primary key (id)
);