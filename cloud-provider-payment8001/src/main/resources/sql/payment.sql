use mytest;
CREATE table payment(
                        id bigint(20) not null auto_increment comment 'ID',
                        serial varchar(200) default '',
                        primary key (id)
)auto_increment=1 default char set =utf8;
insert into payment (serial) value ('testpayment');