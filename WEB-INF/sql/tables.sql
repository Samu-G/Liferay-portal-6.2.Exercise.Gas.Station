create table GB_FuelPump (
	uuid_ VARCHAR(75) null,
	fuelPumpId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	gasolineCapacity INTEGER,
	dieselCapacity INTEGER,
	cashInserted INTEGER,
	inactivityTime INTEGER
);