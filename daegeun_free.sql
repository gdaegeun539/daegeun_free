CREATE TABLE `device_info` (
	`id`	INTEGER	NOT NULL auto_increment,
	`name`	varchar(32)	NULL,
	`category`	varchar(32)	not null,
	`company`	varchar(64)	not null,
	`price`	integer	NULL,
	`spec`	varchar(512)	NULL,
    `rating_avg` float null default 0,
	`photo_name`	varchar(128)	NULL,
	`photo_path`	varchar(128)	NULL
);

CREATE TABLE `review` (
	`id`	integer	NOT NULL auto_increment,
	`dev_id`	INTEGER	NOT NULL,
	`uname`	varchar(40)	NULL,
	`content`	varchar(512)	NULL,
	`pwd`	varchar(64)	NULL,
	`rating`	integer	NULL,
    `reg_date` timestamp null default current_timestamp
);

ALTER TABLE `device_info` ADD CONSTRAINT `PK_DEVICE_INFO` PRIMARY KEY (
	`id`
);

ALTER TABLE `review` ADD CONSTRAINT `PK_REVIEW` PRIMARY KEY (
	`id`
);

-- 샘플 데이터 시작

-- 샘플 데이터 끝

DROP TABLE `device_info`;
DROP TABLE `review`;
