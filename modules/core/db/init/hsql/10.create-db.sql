-- begin TESTSTP_DEBITOR
create table TESTSTP_DEBITOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255) not null,
    LASTNAME varchar(255),
    EMAIL varchar(255) not null,
    DEBT_SUM decimal(19, 2) not null,
    PHONE varchar(255),
    ADDRESS varchar(255) not null,
    PASSPORT_NUMBER varchar(255) not null,
    PASSPORT_SERIES varchar(255) not null,
    DEBT_REPAYMENT_DATE timestamp not null,
    --
    primary key (ID)
)^
-- end TESTSTP_DEBITOR
