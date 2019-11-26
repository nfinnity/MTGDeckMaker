create table card (oracle_id varchar(255) not null, cmc double precision, description TEXT, mana_cost varchar(255), name varchar(255), type varchar(255), image_id bigint, legality_id bigint, primary key (oracle_id)) engine=InnoDB
create table image (id bigint not null auto_increment, art_crop varchar(255), border_crop varchar(255), large varchar(255), normal varchar(255), png varchar(255), small varchar(255), primary key (id)) engine=InnoDB
create table legality (id bigint not null auto_increment, commander varchar(255), duel varchar(255), frontier varchar(255), future varchar(255), legacy varchar(255), modern varchar(255), oldschool varchar(255), pauper varchar(255), penny varchar(255), standard varchar(255), vintage varchar(255), primary key (id)) engine=InnoDB
create table rule (id bigint not null auto_increment, oracle_id varchar(255), rule TEXT, rule_id varchar(255), primary key (id)) engine=InnoDB
alter table card add constraint FK1ti5ovi2tajsbrcnifafrh125 foreign key (image_id) references image (id)
alter table card add constraint FKjcdb69fe19vi0duawbcxk564a foreign key (legality_id) references legality (id)
alter table rule add constraint FK7a0rmd0859s1aij5o1m59gjuv foreign key (rule_id) references card (oracle_id)
create table card (oracle_id varchar(255) not null, cmc double precision, description TEXT, mana_cost varchar(255), name varchar(255), type varchar(255), image_id bigint, legality_id bigint, primary key (oracle_id)) engine=InnoDB
create table image (id bigint not null auto_increment, art_crop varchar(255), border_crop varchar(255), large varchar(255), normal varchar(255), png varchar(255), small varchar(255), primary key (id)) engine=InnoDB
create table legality (id bigint not null auto_increment, commander varchar(255), duel varchar(255), frontier varchar(255), future varchar(255), legacy varchar(255), modern varchar(255), oldschool varchar(255), pauper varchar(255), penny varchar(255), standard varchar(255), vintage varchar(255), primary key (id)) engine=InnoDB
create table rule (id bigint not null auto_increment, oracle_id varchar(255), rule TEXT, rule_id varchar(255), primary key (id)) engine=InnoDB
alter table card add constraint FK1ti5ovi2tajsbrcnifafrh125 foreign key (image_id) references image (id)
alter table card add constraint FKjcdb69fe19vi0duawbcxk564a foreign key (legality_id) references legality (id)
alter table rule add constraint FK7a0rmd0859s1aij5o1m59gjuv foreign key (rule_id) references card (oracle_id)
create table card (oracle_id varchar(255) not null, cmc double precision, description TEXT, mana_cost varchar(255), name varchar(255), type varchar(255), image_id bigint, legality_id bigint, primary key (oracle_id)) engine=InnoDB
create table image (id bigint not null auto_increment, art_crop varchar(255), border_crop varchar(255), large varchar(255), normal varchar(255), png varchar(255), small varchar(255), primary key (id)) engine=InnoDB
create table legality (id bigint not null auto_increment, commander varchar(255), duel varchar(255), frontier varchar(255), future varchar(255), legacy varchar(255), modern varchar(255), oldschool varchar(255), pauper varchar(255), penny varchar(255), standard varchar(255), vintage varchar(255), primary key (id)) engine=InnoDB
create table rule (id bigint not null auto_increment, oracle_id varchar(255), rule TEXT, rule_id varchar(255), primary key (id)) engine=InnoDB
alter table card add constraint FK1ti5ovi2tajsbrcnifafrh125 foreign key (image_id) references image (id)
alter table card add constraint FKjcdb69fe19vi0duawbcxk564a foreign key (legality_id) references legality (id)
alter table rule add constraint FK7a0rmd0859s1aij5o1m59gjuv foreign key (rule_id) references card (oracle_id)
