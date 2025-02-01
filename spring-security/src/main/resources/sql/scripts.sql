create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);

INSERT IGNORE INTO `users` VALUES ('user', '{noop}user', '1');
INSERT IGNORE INTO `authorities` VALUES ('user', 'read');

INSERT IGNORE INTO `users` VALUES ('admin', '{bcrypt}$2a$12$T8BnDhXCT7LdS9z.hGyKfOHiphbXmbFxkynYP75M6.2pXkrxSuEIm', '1');
INSERT IGNORE INTO `authorities` VALUES ('admin', 'admin');

CREATE TABLE `customer` (`id` int NOT NULL AUTO_INCREMENT,`email` varchar(45) NOT NULL,`pwd` varchar(200) NOT NULL,
                            `role` varchar(45) NOT NULL,PRIMARY KEY (`id`));
INSERT  INTO `customer` (`email`, `pwd`, `role`) VALUES ('user1@mrcool.com', '{noop}user1', 'read');
INSERT  INTO `customer` (`email`, `pwd`, `role`) VALUES ('admin@mrcool.com', '{bcrypt}$2a$12$T8BnDhXCT7LdS9z.hGyKfOHiphbXmbFxkynYP75M6.2pXkrxSuEIm', 'admin');