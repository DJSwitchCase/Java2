CREATE TABLE IF NOT EXISTS games
(
    id    BIGSERIAL PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    creationDate varchar(200) not null
);