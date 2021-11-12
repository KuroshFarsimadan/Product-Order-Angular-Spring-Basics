CREATE TABLE
    product
    (
        Id BIGINT NOT NULL,
		name VARCHAR,
		description VARCHAR,
        email VARCHAR,
        phone VARCHAR,        
        model VARCHAR,   
        serial_number VARCHAR,  
        order_price NUMERIC,        
		order_date DATETIME,       
        has_been_contacted BOOLEAN NOT NULL,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO product (id, name, email, model,  phone, order_date, order_price, has_been_contacted)
  VALUES (1, 'Fidget Spinner 2000', 'johnymcintosh@nocompany.com',  'Johny Mcintosh', '123-123-123', '2021-10-25 09:30:30', '1100', 1);
INSERT INTO product (id,  name, email, model, phone, order_date, order_price, has_been_contacted)
  VALUES (2, 'Samsung Briefcase (Red Leather)', 'janedoe@nocompany.com',  'Jane Doe', '123-123-123', '2020-09-29 10:30:30', '1999', 0);
INSERT INTO product (id, name, email, model, phone, order_date, order_price, has_been_contacted)
  VALUES (3, 'LG Laptop Monitor', 'johndoe@nocompany.com',  'John Doe', '123-123-123', '2019-05-15 22:30:30', '2100', 0);

INSERT INTO hibernate_sequence (next_val) VALUES (4);