CREATE TABLE IF NOT EXISTS entry (
id UUID PRIMARY KEY,
code varchar(150) NOT NULL,
entry_key varchar(200) NOT NULL,
entry_value varchar(300),
updated_by varchar(50),
created_by varchar(50),
created_date timestamp,
updated_date timestamp
);