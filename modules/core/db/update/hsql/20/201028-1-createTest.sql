create table TEST_TEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COGNOME varchar(100),
    NOME varchar(100),
    INDIRIZZO varchar(100),
    --
    primary key (ID)
);