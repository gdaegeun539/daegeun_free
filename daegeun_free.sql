CREATE TABLE `device_info` (
	`id`	INTEGER	NOT NULL auto_increment,
	`name`	varchar(32)	NULL,
	`category`	varchar(32)	not null,
	`company`	varchar(64)	not null,
	`price`	integer	NULL,
	`spec`	varchar(512)	NULL,
    `rating_avg` float null default 0,
	`photo_name`	varchar(128)	NULL,
	`photo_path`	varchar(512)	NULL,
    primary key(id)
) default character set utf8;

CREATE TABLE `review` (
	`id`	integer	NOT NULL auto_increment,
	`dev_id`	INTEGER	NOT NULL,
	`uname`	varchar(40)	NULL,
	`content`	varchar(512)	NULL,
	`pwd`	varchar(64)	NULL,
	`rating`	float	NULL,
    `reg_date` timestamp null default current_timestamp,
    primary key(id)
) default character set utf8;

-- ALTER TABLE `device_info` ADD CONSTRAINT `PK_DEVICE_INFO` PRIMARY KEY (
-- 	`id`
-- );

-- ALTER TABLE `review` ADD CONSTRAINT `PK_REVIEW` PRIMARY KEY (
-- 	`id`
-- );

-- alter table device_info modify `photo_path` varchar(512) null;
-- alter table review modify `rating` float null;

alter table device_info convert to charset utf8;
alter table review convert to charset utf8;

-- 샘플 데이터 시작
insert into device_info (id, name, category, company, price, spec, photo_name, photo_path) values (1, "갤럭시 S23 울트라", 	"smartphone", "samsung", 1155000, '{\"processsor\":\"QualcommSnapdragon8Gen2forGalaxy\",\"ram\":\"8GB\",\"storage\":\"256/512GB\",\"display\":\"6.1인치2340X1080\",\"battery\":\"3900mAh\"}', "none", "https://images.samsung.com/kdp/goods/2023/01/11/1f57a4f8-ae56-42ea-bcaf-c66c238341c3.png?$PD_GALLERY_L_PNG$");
insert into device_info (id, name, category, company, price, spec, photo_name, photo_path) values (2, "픽셀7 프로", "smartphone", "google", 1058838, "{\"processsor\":\"GoogleTensorG2\",\"ram\":\"12GB\",\"storage\":\"128/256/512GB\",\"display\":\"6.7인치1440X3120\",\"battery\":\"5000mAh\"}", "none", 'https://m.media-amazon.com/images/I/712JkPUUlRL._AC_SX679_.jpg');
insert into device_info (id, name, category, company, price, spec, photo_name, photo_path) values (3, "아이폰 14", "smartphone", "apple", 1250000, "{\"processsor\":\"AppleA15bionic\",\"ram\":\"6GB\",\"storage\":\"128/256/512GB\",\"display\":\"6.1인치1170X2532\",\"battery\":\"3279mAh\"}", "none", "https://m.media-amazon.com/images/I/61cwywLZR-L._AC_SX679_.jpg");
insert into device_info (id, name, category, company, price, spec, photo_name, photo_path) values (4, "샤오미 홍미노트 11", "smartphone", "xiaomi", 399000, "{\"processsor\":\"QualcommSnapdragon695\",\"ram\":\"6/8GB\",\"storage\":\"128/256GB\",\"display\":\"6.67인치1080X2400\",\"battery\":\"5000mAh\"}", "none", "https://thumbnail7.coupangcdn.com/thumbnails/remote/492x492ex/image/vendor_inventory/b5dc/ed38896a98e8b3ccb0ec4b5f6b504a366063ac81cfbc8492c81f18277a0c.jpg");

insert into review (id, dev_id, uname, content, pwd, rating) values (1, 1, "사용자1", "괜찮네요", "1234", 4.0);
insert into review (id, dev_id, uname, content, pwd, rating) values (2, 2, "사용자2", "통화하기 불편하네요", "1234", 3.5);
insert into review (id, dev_id, uname, content, pwd, rating) values (3, 3, "사용자3", "전작이랑 달라진 게 안보이네요", "1234", 3.0);
insert into review (id, dev_id, uname, content, pwd, rating) values (4, 4, "사용자4", "서브로 쓸만하네요", "1234", 3.8);reviewreview
-- 샘플 데이터 끝

DROP TABLE `device_info`;
DROP TABLE `review`;
