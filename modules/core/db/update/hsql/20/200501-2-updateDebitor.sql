alter table TESTSTP_DEBITOR add column DEBT_REPAYMENT_DATE timestamp ^
update TESTSTP_DEBITOR set DEBT_REPAYMENT_DATE = current_timestamp where DEBT_REPAYMENT_DATE is null ;
alter table TESTSTP_DEBITOR alter column DEBT_REPAYMENT_DATE set not null ;
alter table TESTSTP_DEBITOR add column PASSPORT_SERIES varchar(255) ^
update TESTSTP_DEBITOR set PASSPORT_SERIES = '' where PASSPORT_SERIES is null ;
alter table TESTSTP_DEBITOR alter column PASSPORT_SERIES set not null ;
alter table TESTSTP_DEBITOR add column ADDRESS varchar(255) ^
update TESTSTP_DEBITOR set ADDRESS = '' where ADDRESS is null ;
alter table TESTSTP_DEBITOR alter column ADDRESS set not null ;
alter table TESTSTP_DEBITOR add column PASSPORT_NUMBER varchar(255) ^
update TESTSTP_DEBITOR set PASSPORT_NUMBER = '' where PASSPORT_NUMBER is null ;
alter table TESTSTP_DEBITOR alter column PASSPORT_NUMBER set not null ;
alter table TESTSTP_DEBITOR alter column DEBT_SUM set data type decimal(19, 2) ;
