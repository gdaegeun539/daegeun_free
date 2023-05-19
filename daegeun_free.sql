CREATE TABLE `device_info` (
	`id`	INTEGER	NOT NULL,
	`name`	varchar(32)	NULL,
	`category`	varchar(32)	NULL,
	`company`	varchar(64)	NULL,
	`price`	integer	NULL,
	`spec`	varchar(512)	NULL,
	`photo_name`	varchar(128)	NULL,
	`photo_path`	varchar(128)	NULL
);

CREATE TABLE `review` (
	`id`	integer	NOT NULL,
	`dev_id`	INTEGER	NOT NULL,
	`uname`	varchar(40)	NULL,
	`comment`	varchar(512)	NULL,
	`pwd`	varchar(64)	NULL,
	`rating`	integer	NULL
);

ALTER TABLE `device_info` ADD CONSTRAINT `PK_DEVICE_INFO` PRIMARY KEY (
	`id`
);

ALTER TABLE `review` ADD CONSTRAINT `PK_REVIEW` PRIMARY KEY (
	`id`
);

desc review;

-- 샘플 데이터 자리 

DROP TABLE `device_info`;
DROP TABLE `review`;
