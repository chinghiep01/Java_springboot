CREATE TABLE IF NOT EXISTS Tax (

    id INT(6) NOT NULL AUTO_INCREMENT,

    taxable_income VARCHAR(50) NOT NULL,

    addition_charge DECIMAL(10,2) NOT NULL,

    charge_every_one_dollar DECIMAL(10,2) NOT NULL,


    primary key (id)
);

INSERT INTO Tax
    (taxable_income,  addition_charge , charge_every_one_dollar ) 
VALUES 
    ("$0 - $18,200" , 0 , 0),
    ("$18,201 - $37,000", 0, 0.19),
    ("$37,001 - $87,000", 3572, 0.325),
    ("$87,001 - $180,000",19822, 0.37),
    ("180,001 and over", 54232, 0.45),