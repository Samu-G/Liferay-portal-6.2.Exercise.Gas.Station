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

create table GB_Pompa (
	uuid_ VARCHAR(75) null,
	pompaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	quantitaDiesel INTEGER,
	quantitaBenzina INTEGER,
	tempoGiacenza INTEGER,
	incassoTotalePompa INTEGER
);

create table GB_RifornimentiFatti (
	uuid_ VARCHAR(75) null,
	rifornimentiFattiId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tipoDiRifornimento BOOLEAN,
	quantita INTEGER,
	introitoPompa DOUBLE
);

create table GB_Rifornimento (
	rifornimentoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tipoCarburante VARCHAR(75) null,
	denaroInserito INTEGER
);

create table GB_StazioneDiRifornimento (
	uuid_ VARCHAR(75) null,
	stazioneDiRifornimentoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table SG_Pompa (
	uuid_ VARCHAR(75) null,
	pompaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	quantitaDiesel INTEGER,
	quantitaBenzina INTEGER,
	tempoGiacenza INTEGER,
	incassoTotalePompa INTEGER,
	statoPompa BOOLEAN
);

create table SG_Rifornimento (
	rifornimentoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tipoCarburante VARCHAR(75) null,
	denaroInserito INTEGER,
	pompaId LONG
);

create table SG_StazioneDiRifornimento (
	uuid_ VARCHAR(75) null,
	stazioneDiRifornimentoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	prezzoBenzina INTEGER,
	prezzoDiesel INTEGER
);