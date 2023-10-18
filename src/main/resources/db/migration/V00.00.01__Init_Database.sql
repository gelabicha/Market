create table countries(
id serial primary key,
iso_code_2 varchar(2) NOT NULL,
iso_code_3 varchar(3) NOT NULL,
name text,
name_geo text
);

create table users(
id serial primary key,
email text UNIQUE NOT NULL,
password text not null,
first_name text,
last_name text,
last_login_date timestamp DEFAULT CURRENT_TIMESTAMP,
active boolean DEFAULT 't',
changed_by int references users(id),
changed_at timestamp DEFAULT CURRENT_TIMESTAMP,
created_by int  references users(id),
created_at timestamp NOT NULL
);

create table companies(
id serial primary key,
parent_id int not null,
country_id int not null references countries(id),
name text,
name_geo text,
active boolean default 't',
changed_by int references users(id),
changed_at timestamp DEFAULT CURRENT_TIMESTAMP,
created_by int references users(id),
created_at timestamp NOT NULL
);

create table products(
id serial primary key,
ean text UNIQUE not null ,
name text,
company_id int not null  references companies(id),
country_id int not null  references countries(id),
description text,
active boolean  default 't' Not null,
changed_by int references users(id),
changed_at timestamp DEFAULT CURRENT_TIMESTAMP,
created_by int  references users(id),
created_at timestamp NOT NULL
);