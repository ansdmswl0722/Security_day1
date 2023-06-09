CREATE TABLE IF NOT EXISTS `Members` (
    `member_id` varchar(50) not null,
    `name` varchar(50) not null,
    `pwd` varchar(100) not null,

    primary key(`member_id`)
);

CREATE TABLE IF NOT EXISTS `Authorities` (
    `member_id` varchar(50) not null,
    `authority` varchar(50) not null,

    primary key(`member_id`)
);

-- MERGE INTO `Members` key (`member_id`) values ('admin','admin','admin');
-- MERGE INTO `Members` key (`member_id`) values ('moon','moon','moon');
--
-- MERGE INTO `Authorities` key (`member_id`) values ('admin', 'ROLE_ADMIN');
-- MERGE INTO `Authorities` key (`member_id`) values ('moon', 'ROLE_USER');