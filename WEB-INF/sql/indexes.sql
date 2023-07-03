create index IX_2A69592C on GB_FuelPump (uuid_);
create index IX_5C77777C on GB_FuelPump (uuid_, companyId);
create unique index IX_A32FACFE on GB_FuelPump (uuid_, groupId);

create index IX_985BFD53 on GB_Pompa (uuid_);
create index IX_1D4684F5 on GB_Pompa (uuid_, companyId);
create unique index IX_925C4B7 on GB_Pompa (uuid_, groupId);

create index IX_66A157C2 on GB_RifornimentiFatti (uuid_);
create index IX_EC0B9F26 on GB_RifornimentiFatti (uuid_, companyId);
create unique index IX_361DB728 on GB_RifornimentiFatti (uuid_, groupId);

create index IX_7B254D6A on GB_StazioneDiRifornimento (uuid_);
create index IX_781107E on GB_StazioneDiRifornimento (uuid_, companyId);
create unique index IX_1E6F9E80 on GB_StazioneDiRifornimento (uuid_, groupId);

create index IX_C82BBABA on SG_Pompa (uuid_);
create index IX_85A8312E on SG_Pompa (uuid_, companyId);
create unique index IX_B4472B30 on SG_Pompa (uuid_, groupId);

create index IX_CDD92AE3 on SG_StazioneDiRifornimento (uuid_);
create index IX_15A83D65 on SG_StazioneDiRifornimento (uuid_, companyId);
create unique index IX_27AD927 on SG_StazioneDiRifornimento (uuid_, groupId);