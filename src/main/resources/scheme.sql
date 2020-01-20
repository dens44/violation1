DROP TABLE if EXISTS violation;

CREATE TABLE violation(

    date DATE,
    value varchar (100),
    violationId DOUBLE,
    drivingStyleId double,
    lattitude double,
    longtitude double,

PRIMARY KEY (violationId)--,
-- FOREIGN KEY (drivingStyleId) REFERENCES drivingStyle (drivingStyleId) ON DELETE RESTRICT
)